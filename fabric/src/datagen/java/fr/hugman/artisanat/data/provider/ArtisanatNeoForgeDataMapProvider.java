package fr.hugman.artisanat.data.provider;

import com.mojang.serialization.Codec;
import fr.hugman.artisanat.block.ArtisanatOxidizableBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricCodecDataProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/**
 * Generates one of NeoForge's block data maps ({@code data/neoforge/data_maps/block/<name>.json}),
 * whose values are objects with a single block field. Fabric ignores these files.
 */
public class ArtisanatNeoForgeDataMapProvider extends FabricCodecDataProvider<Map<ResourceKey<Block>, Block>> {
    private final String name;
    private final Map<ResourceKey<Block>, Block> values;

    private ArtisanatNeoForgeDataMapProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture, String name, String field, Map<ResourceKey<Block>, Block> values) {
        super(output, registriesFuture, PackOutput.Target.DATA_PACK, "data_maps/block",
                Codec.unboundedMap(ResourceKey.codec(Registries.BLOCK), BuiltInRegistries.BLOCK.byNameCodec().fieldOf(field).codec()).fieldOf("values").codec());
        this.name = name;
        this.values = values;
    }

    /**
     * Replaces Fabric's {@code OxidizableBlocksRegistry#registerNextStage}.
     */
    public static ArtisanatNeoForgeDataMapProvider oxidizables(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        Map<ResourceKey<Block>, Block> values = new LinkedHashMap<>();
        ArtisanatOxidizableBlocks.register((block, next) -> values.put(key(block), next), (block, waxed) -> {
        });
        return new ArtisanatNeoForgeDataMapProvider(output, registriesFuture, "oxidizables", "next_oxidation_stage", values);
    }

    /**
     * Replaces Fabric's {@code OxidizableBlocksRegistry#registerWaxable}.
     */
    public static ArtisanatNeoForgeDataMapProvider waxables(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        Map<ResourceKey<Block>, Block> values = new LinkedHashMap<>();
        ArtisanatOxidizableBlocks.register((block, next) -> {
        }, (block, waxed) -> values.put(key(block), waxed));
        return new ArtisanatNeoForgeDataMapProvider(output, registriesFuture, "waxables", "waxed", values);
    }

    private static ResourceKey<Block> key(Block block) {
        return block.builtInRegistryHolder().key();
    }

    @Override
    protected void configure(BiConsumer<Identifier, Map<ResourceKey<Block>, Block>> provider, HolderLookup.Provider lookup) {
        provider.accept(Identifier.fromNamespaceAndPath("neoforge", this.name), this.values);
    }

    @Override
    public String getName() {
        return "NeoForge Data Map: " + this.name;
    }
}
