package com.hugman.artisanat.mixin;

import com.hugman.artisanat.util.CopperMap;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeMixin {
    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    public void artisanat$customWaxedBlocks(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        BlockState state = world.getBlockState(pos);
        ItemStack stack = context.getStack();

        Optional<BlockState> decreasedBlock = CopperMap.getDecreasedState(state);
        Optional<BlockState> unwaxedBlock = CopperMap.getUnwaxedState(state);

        Optional<BlockState> blockf = Optional.empty();

        if (decreasedBlock.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.syncWorldEvent(player, 3005, pos, 0);
            blockf = decreasedBlock;
        }
        if(unwaxedBlock.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.syncWorldEvent(player, 3004, pos, 0);
            blockf = unwaxedBlock;
        }

        if (blockf.isPresent()) {
            if (player instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)player, pos, stack);
            }

            world.setBlockState(pos, blockf.get(), 11);
            if (player != null) {
                stack.damage(1, player, (p) -> {
                    p.sendToolBreakStatus(context.getHand());
                });
            }

            cir.setReturnValue(ActionResult.success(world.isClient));
        }
    }
}
