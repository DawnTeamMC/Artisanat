package fr.hugman.artisanat.block.type;

import fr.hugman.artisanat.Artisanat;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;

public class ArtisanatBlockSetTypes {
    public static final BlockSetType OAK_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Artisanat.id("oak_wood"));
    public static final BlockSetType SPRUCE_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.SPRUCE).register(Artisanat.id("spruce_wood"));
    public static final BlockSetType BIRCH_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.BIRCH).register(Artisanat.id("birch_wood"));
    public static final BlockSetType JUNGLE_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(Artisanat.id("jungle_wood"));
    public static final BlockSetType ACACIA_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.ACACIA).register(Artisanat.id("acacia_wood"));
    public static final BlockSetType CHERRY_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.CHERRY).register(Artisanat.id("cherry_wood"));
    public static final BlockSetType DARK_OAK_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.DARK_OAK).register(Artisanat.id("dark_oak_wood"));
    public static final BlockSetType PALE_OAK_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.PALE_OAK).register(Artisanat.id("pale_oak_wood"));
    public static final BlockSetType CRIMSON_HYPHAE = BlockSetTypeBuilder.copyOf(BlockSetType.CRIMSON).register(Artisanat.id("crimson_hyphae"));
    public static final BlockSetType WARPED_HYPHAE = BlockSetTypeBuilder.copyOf(BlockSetType.WARPED).register(Artisanat.id("warped_hyphae"));
    public static final BlockSetType MANGROVE_WOOD = BlockSetTypeBuilder.copyOf(BlockSetType.MANGROVE).register(Artisanat.id("mangrove_wood"));
}
