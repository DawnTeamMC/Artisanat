package fr.hugman.artisanat.block;

import fr.hugman.dawn.DawnFactory;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;

public class MOreBlocks {
    private final String name;
    private final Block platedBlock;
    private final Block cutBlock;
    private final Block bricks;
    private final Block tiles;


    public MOreBlocks(String name, AbstractBlock.Settings baseSettings) {
        this.name = name;
        this.platedBlock = DawnFactory.block(DawnBlockSettings.copyOf(baseSettings).item());
        this.cutBlock = DawnFactory.block(DawnBlockSettings.copyOf(baseSettings).item());
        this.bricks = DawnFactory.block(DawnBlockSettings.copyOf(baseSettings).item());
        this.tiles = DawnFactory.block(DawnBlockSettings.copyOf(baseSettings).item());
    }

    public void register(Registrar r) {
        r.add("plated_" + this.name + "_block", this.platedBlock);
        r.add("cut_" + this.name + "_block", this.cutBlock);
        r.add(this.name + "_bricks", this.bricks);
        r.add(this.name + "_tiles", this.tiles);

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
            e.add(this.platedBlock);
            e.add(this.cutBlock);
            e.add(this.bricks);
            e.add(this.tiles);
        });
    }
}
