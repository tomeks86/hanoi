package edu.tseidler.hanoi;

import java.util.Objects;

public class Move {
    private final Stick from;
    private final Stick to;
    private final Stick temp;

    public Move(Stick from, Stick to, Stick temp) {
        this.from = from;
        this.to = to;
        this.temp = temp;
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
