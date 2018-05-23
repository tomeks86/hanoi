package edu.tseidler.hanoi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static edu.tseidler.hanoi.Stick.FIRST;
import static edu.tseidler.hanoi.Stick.SECOND;
import static edu.tseidler.hanoi.Stick.THIRD;
import static org.testng.Assert.*;

public class StickTest {
    @DataProvider
    public static Object[][] stickTempData() {
        return new Object[][]{
                {FIRST, SECOND, THIRD},
                {SECOND, FIRST, THIRD},
                {THIRD, FIRST, SECOND},
                {FIRST, THIRD, SECOND},
                {THIRD, SECOND, FIRST},
                {SECOND, THIRD, FIRST},
        };
    }

    @Test(dataProvider = "stickTempData")
    public void shouldReturnThirdFromEnumSet(Stick one, Stick two, Stick expectedTemp) {
        assertEquals(Stick.temp(one, two), expectedTemp);
    }
}