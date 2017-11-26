package com.gmail.user0abc.wildkings.misc;

import java.util.HashMap;
import java.util.Map;

public class WildKingsSettings {


    public WildKingsSettings() {
        loadSettings();
    }

    private void loadSettings() {
    }

    public static int getTigerChance() {
        return 100;
    }

    public static long getMapSeed() {
        return System.currentTimeMillis();
    }

    public static double kingsRadius() {
        return 32;
    }
}
