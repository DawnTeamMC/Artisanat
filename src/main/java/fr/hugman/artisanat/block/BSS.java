package fr.hugman.artisanat.block;

import fr.hugman.dawn.DawnFactory;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;

import static fr.hugman.artisanat.util.StringUtil.parsePluralBlockName;

public class BSS {
    protected final String name;
    protected final Block block;
    protected final Block slab;
    protected final Block stairs;

    public BSS(String name, AbstractBlock.Settings baseSettings) {
        this.name = name;
        this.block = DawnFactory.block(DawnBlockSettings.copyOf(baseSettings).item());
        this.slab = new SlabBlock(DawnBlockSettings.copyOf(baseSettings).item());
        this.stairs = new StairsBlock(Blocks.STONE.getDefaultState(), DawnBlockSettings.copyOf(baseSettings).item());
    }

    public final void register(Registrar r) {
        register(r, true);
    }

    public void register(Registrar r, boolean registerGroup) {
        r.add(this.name, this.block);

        String nameSingular = parsePluralBlockName(this.name);
        r.add(nameSingular + "_slab", this.slab);
        r.add(nameSingular + "_stairs", this.stairs);

        if (registerGroup) {
            ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
                e.add(this.block);
                e.add(this.slab);
                e.add(this.stairs);
            });
        }
    }
}
