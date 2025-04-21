package fr.hugman.artisanat.util;

public class NameUtil {
    public static String parsePluralBlock(String name) {
        if(name.endsWith("bricks") || name.endsWith("tiles")) return name.substring(0, name.length() - 1);
        else return name;
    }
}