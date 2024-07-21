package fr.hugman.artisanat.block;

import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;

public class Terraconcrete {
    protected final String name;
    protected final Block slab;
    protected final Block stairs;
    protected final Block wall;
    protected final Block pressurePlate;
    protected final Block button;

    public Terraconcrete(String name, AbstractBlock.Settings baseSettings) {
        this.name = name;
        this.slab = new SlabBlock(DawnBlockSettings.copyOf(baseSettings).item());
        this.stairs = new StairsBlock(Blocks.STONE.getDefaultState(), DawnBlockSettings.copyOf(baseSettings).item());
        this.wall = new WallBlock(DawnBlockSettings.copyOf(baseSettings).item());
        this.pressurePlate = new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, DawnBlockSettings.copyOf(baseSettings).item(), BlockSetType.STONE);
        this.button = new ButtonBlock(DawnBlockSettings.copyOf(baseSettings)
                .item()
                .strength(0.5f)
                .noCollision()
                .pistonBehavior(PistonBehavior.DESTROY),
                BlockSetType.STONE, 30, false);
    }

    public final void register(Registrar r) {
        register(r, true);
    }

    public void register(Registrar r, boolean registerGroup) {
        r.add(this.name + "_slab", this.slab);
        r.add(this.name + "_stairs", this.stairs);
        r.add(this.name + "_wall", this.wall);
        r.add(this.name + "_pressure_plate", this.pressurePlate);
        r.add(this.name + "_button", this.button);

        if (registerGroup) {
            ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, e -> {
                e.add(this.slab);
                e.add(this.stairs);
                e.add(this.wall);
                e.add(this.button);
            });

            ItemGroupHelper.append(ItemGroups.REDSTONE, e -> {
                e.add(this.pressurePlate);
            });
        }
    }
}
