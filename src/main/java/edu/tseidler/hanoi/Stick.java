package edu.tseidler.hanoi;

import java.util.EnumSet;

public enum Stick {
    FIRST, SECOND, THIRD;
    private static EnumSet<Stick> all = EnumSet.allOf(Stick.class);

    public static Stick temp(Stick one, Stick two) {
        return all.complementOf(EnumSet.of(one, two)).iterator().next();
    }
}
