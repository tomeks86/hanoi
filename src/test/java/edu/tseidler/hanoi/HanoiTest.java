package edu.tseidler.hanoi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static edu.tseidler.hanoi.Move.getMove;
import static org.assertj.core.api.Assertions.assertThat;

public class HanoiTest {
    private Hanoi hanoi;

    @DataProvider
    private static Object[][] hanoiSolutionsData() {
        return new Object[][]{
                {1, new Move[]{
                        getMove(1, 3)
                }},
                {2, new Move[]{
                        getMove(1, 2),
                        getMove(1, 3),
                        getMove(2, 3),
                }},
                {3, new Move[]{
                        getMove(1, 3),
                        getMove(1, 2),
                        getMove(3, 2),
                        getMove(1, 3),
                        getMove(2, 1),
                        getMove(2, 3),
                        getMove(1, 3)
                }}
        };
    }

    @Test(dataProvider = "hanoiSolutionsData")
    public void shouldSolveHanoi(int size, Move[] moves) {
        hanoi = new Hanoi(size);

        assertThat(hanoi.solution()).containsExactly(moves);
    }

}
