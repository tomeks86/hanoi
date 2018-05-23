package edu.tseidler.hanoi;

public class Move {
    private final Stick from;
    private final Stick to;
    private final Stick temp;

    public Move(Stick from, Stick to) {
        this.from = from;
        this.to = to;
        this.temp = Stick.temp(from, to);
    }

    public Stick getFrom() {
        return from;
    }

    public Stick getTo() {
        return to;
    }

    public Stick getTemp() {
        return temp;
    }
}
