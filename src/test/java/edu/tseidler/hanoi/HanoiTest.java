package edu.tseidler.hanoi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HanoiTest {
    private Hanoi hanoi;

    @DataProvider
    private static Object[][] solutionsForHanoi() {
        return new Object[][]{
                {1, new Move[] {
                        new Move(0, 1),
                }},
                {2, new Move[] {
                        new Move(0, 1),
                        new Move(0, 2),
                        new Move(1, 2)
                }}
        };
    }

    @Test(dataProvider = "solutionsForHanoi")
    public void shouldPredictSolution(int blocks, Move[] solution) {
        hanoi = new Hanoi(blocks);
        assertEquals(hanoi.getSolution(), solution);
    }
}
