package fr.hugman.artisanat.util;

import net.minecraft.util.DyeColor;

import java.util.function.Consumer;

public class ColorUtil {
    public static void forEachDyeColor(Consumer<DyeColor> consumer) {
        for (DyeColor color : DyeColor.values()) {
            consumer.accept(color);
        }
    }
}
