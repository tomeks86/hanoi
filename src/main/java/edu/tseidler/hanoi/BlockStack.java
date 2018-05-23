package edu.tseidler.hanoi;

import java.util.Stack;

public class BlockStack extends Stack<Block> {
    @Override
    public Block push(Block candidate) {
        if (this.isEmpty())
            return super.push(candidate);
        else if (candidate.isHeavier(super.peek()))
            throw new IllegalStateException("cannot push heavier block over the lighter");
        return super.push(candidate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Block block : this) {
            sb.append(block.getWeight() + " ");
        }
        return sb.toString();
    }
}
