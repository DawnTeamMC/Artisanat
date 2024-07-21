package fr.hugman.artisanat.block;

import fr.hugman.dawn.Registrar;
import fr.hugman.dawn.block.DawnBlockSettings;
import fr.hugman.dawn.item.ItemGroupHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.DyeColor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static fr.hugman.artisanat.util.ColorUtil.forEachDyeColor;

public class ColoredTerraconcrete {
    private final Map<DyeColor, Terraconcrete> map = new HashMap<>();

    public ColoredTerraconcrete(String name, AbstractBlock.Settings baseSettings) {
        forEachDyeColor(color -> map.put(color,
                new Terraconcrete(color.getName() + "_" + name,
                        DawnBlockSettings.copyOf(baseSettings))));
    }

    public void register(Registrar r) {
        forEachDyeColor(color -> map.get(color).register(r, false));

        var colors = Arrays.stream(DyeColor.values()).map(map::get).toList();

        ItemGroupHelper.append(ItemGroups.COLORED_BLOCKS, e -> {
            colors.forEach(bss -> e.add(bss.slab));
            colors.forEach(bss -> e.add(bss.stairs));
            colors.forEach(bss -> e.add(bss.wall));
            colors.forEach(bss -> e.add(bss.pressurePlate));
        });

        ItemGroupHelper.append(ItemGroups.REDSTONE, e ->
                colors.forEach(bss -> e.add(bss.pressurePlate)));
    }
}
