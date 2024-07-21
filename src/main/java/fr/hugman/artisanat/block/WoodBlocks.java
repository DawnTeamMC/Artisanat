package fr.hugman.artisanat.block;

import fr.hugman.dawn.DawnFactory;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.ItemGroups;

public class WoodBlocks {
    private final String name;
    private final Block slab;
    private final Block stairs;
    private final Block button;

    public WoodBlocks(String name, Block baseBlock, BlockSetType blockSetType) {
        this.name = name;
        this.slab = new SlabBlock(DawnBlockSettings.copy(baseBlock).item());
        this.stairs = new StairsBlock(baseBlock.getDefaultState(), DawnBlockSettings.copy(baseBlock).item());
        this.button = DawnFactory.woodenButton(baseBlock, blockSetType);
    }

    public void register(Registrar r) {
        r.add(this.name + "_slab", this.slab);
        r.add(this.name + "_stairs", this.stairs);
        r.add(this.name + "_button", this.button);

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
            e.add(this.slab);
            e.add(this.stairs);
            e.add(this.button);
        });
    }
}
