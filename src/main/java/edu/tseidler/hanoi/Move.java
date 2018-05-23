package edu.tseidler.hanoi;

import java.util.Objects;

public class Move {
    private final Stick from;
    private final Stick to;
    private final Stick temp;

    Move(Stick from, Stick to) {
        this.from = from;
        this.to = to;
        this.temp = Stick.temp(from, to);
    }

    public static Move getMove(int from, int to) {
        return new Move(Stick.values()[from - 1], Stick.values()[to - 1]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return from == move.from &&
                to == move.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return (from.ordinal() + 1) + " -> " + (to.ordinal() + 1);
    }
}
