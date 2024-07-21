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

public class ColoredBSS {
    private final Map<DyeColor, BSS> map = new HashMap<>();

    public ColoredBSS(String name, AbstractBlock.Settings baseSettings) {
        forEachDyeColor(color -> map.put(color,
                new BSS(color.getName() + "_" + name,
                        DawnBlockSettings.copyOf(baseSettings))));
    }

    public void register(Registrar r) {
        forEachDyeColor(color -> map.get(color).register(r, false));

        ItemGroupHelper.append(ItemGroups.COLORED_BLOCKS, e -> {
            var colors = Arrays.stream(DyeColor.values()).map(map::get).toList();

            colors.forEach(bss -> e.add(bss.block));
            colors.forEach(bss -> e.add(bss.slab));
            colors.forEach(bss -> e.add(bss.stairs));
        });
    }
}
