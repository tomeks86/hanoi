package edu.tseidler.hanoi;

import java.util.Stack;

public class BlockStack extends Stack<Block> {


    @Override
    public Block push(Block candidate) {
        if (this.isEmpty())
            return super.push(candidate);
        else if (super.peek().getWeight() < candidate.getWeight())
            throw new IllegalStateException("cannot push heavier block over the lighter");
        return null;
    }
}
