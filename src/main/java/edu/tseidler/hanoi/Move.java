package edu.tseidler.hanoi;

import java.util.Objects;

public class Move {
    private final Stick from;
    private final Stick to;

    public Move(Stick from, Stick to) {
        this.from = from;
        this.to = to;
    }

    public Stick getFrom() {
        return from;
    }

    public Stick getTo() {
        return to;
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
}
