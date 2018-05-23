package edu.tseidler.hanoi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BlockStackTest {
    private BlockStack blocks;

    @BeforeMethod
    public void setUp() {
        blocks = new BlockStack();
    }

    @Test
    public void shouldAddBlockOnEmptyStack() {
        Block one = new Block(1);

        assertEquals(blocks.push(one), one);
    }

    @Test
    public void shouldAddBlockOnHeavierBlock() {
        blocks.push(new Block(5));
        Block one = new Block(1);

        assertEquals(blocks.push(one), one);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void shouldNotAllowPushingOnALighterBLock() {
        blocks.push(new Block(1));
        blocks.push(new Block(5));
    }
}