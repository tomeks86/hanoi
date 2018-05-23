package edu.tseidler.hanoi;

class Block {
    private final int weight;

    Block(int weight) {
        this.weight = weight;
    }

    public boolean isHeavier(Block other) {
        return weight > other.weight;
    }
}
