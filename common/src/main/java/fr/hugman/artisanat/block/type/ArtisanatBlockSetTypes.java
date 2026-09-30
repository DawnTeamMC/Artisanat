package fr.hugman.artisanat.block.type;

import fr.hugman.artisanat.Artisanat;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArtisanatBlockSetTypes {
    public static final BlockSetType OAK_WOOD = copyOf(BlockSetType.OAK, Artisanat.id("oak_wood"));
    public static final BlockSetType SPRUCE_WOOD = copyOf(BlockSetType.SPRUCE, Artisanat.id("spruce_wood"));
    public static final BlockSetType BIRCH_WOOD = copyOf(BlockSetType.BIRCH, Artisanat.id("birch_wood"));
    public static final BlockSetType JUNGLE_WOOD = copyOf(BlockSetType.JUNGLE, Artisanat.id("jungle_wood"));
    public static final BlockSetType ACACIA_WOOD = copyOf(BlockSetType.ACACIA, Artisanat.id("acacia_wood"));
    public static final BlockSetType CHERRY_WOOD = copyOf(BlockSetType.CHERRY, Artisanat.id("cherry_wood"));
    public static final BlockSetType DARK_OAK_WOOD = copyOf(BlockSetType.DARK_OAK, Artisanat.id("dark_oak_wood"));
    public static final BlockSetType PALE_OAK_WOOD = copyOf(BlockSetType.PALE_OAK, Artisanat.id("pale_oak_wood"));
    public static final BlockSetType CRIMSON_HYPHAE = copyOf(BlockSetType.CRIMSON, Artisanat.id("crimson_hyphae"));
    public static final BlockSetType WARPED_HYPHAE = copyOf(BlockSetType.WARPED, Artisanat.id("warped_hyphae"));
    public static final BlockSetType MANGROVE_WOOD = copyOf(BlockSetType.MANGROVE, Artisanat.id("mangrove_wood"));

    private static BlockSetType copyOf(BlockSetType base, Identifier id) {
        return BlockSetType.register(new BlockSetType(id.toString(), base.canOpenByHand(), base.canOpenByWindCharge(), base.canButtonBeActivatedByArrows(),
                base.pressurePlateSensitivity(), base.soundType(), base.doorClose(), base.doorOpen(), base.trapdoorClose(), base.trapdoorOpen(),
                base.pressurePlateClickOff(), base.pressurePlateClickOn(), base.buttonClickOff(), base.buttonClickOn()));
    }
}
