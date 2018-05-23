package edu.tseidler.hanoi;

public class Block implements Comparable<Block> {
    private final int weight;

    public Block(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Block other) {
        return weight - other.weight;
    }
}
