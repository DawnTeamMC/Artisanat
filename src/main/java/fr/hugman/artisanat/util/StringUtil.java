package fr.hugman.artisanat.util;

public class StringUtil {
    public static String parsePluralBlockName(String name) {
        if(name.endsWith("bricks") || name.endsWith("tiles")) return name.substring(0, name.length() - 1);
        else return name;
    }
}
