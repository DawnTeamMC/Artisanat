package fr.hugman.artisanat.block;

import fr.hugman.dawn.DawnFactory;
import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;

import static fr.hugman.artisanat.util.StringUtil.parsePluralBlockName;

public class BSSW extends BSS {
    protected final Block wall;

    public BSSW(String name, AbstractBlock.Settings baseSettings) {
        super(name, baseSettings);
        this.wall = DawnFactory.wall(this.block);
    }

    @Override
    public void register(Registrar r, boolean registerGroup) {
        super.register(r, registerGroup);
        r.add(parsePluralBlockName(this.name) + "_wall", this.wall);

        if (registerGroup) {
            ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
                e.add(this.wall);
            });
        }
    }
}
