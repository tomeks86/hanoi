package edu.tseidler.hanoi;

class Block {
    private final int weight;

    Block(int weight) {
        this.weight = weight;
    }

    boolean isHeavier(Block other) {
        return weight > other.weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    public int getWeight() {
        return weight;
    }
}
