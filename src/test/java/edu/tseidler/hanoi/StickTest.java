package edu.tseidler.hanoi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static edu.tseidler.hanoi.Stick.*;
import static org.testng.Assert.assertEquals;

public class StickTest {
    @DataProvider
    public static Object[][] stickTempData() {
        return new Object[][]{
                {START, TARGET, HELP},
                {TARGET, START, HELP},
                {START, HELP, TARGET},
                {HELP, START, TARGET},
                {HELP, TARGET, START},
                {TARGET, HELP, START},
        };
    }

    @Test(dataProvider = "stickTempData")
    public void shouldReturnThirdFromEnumSet(Stick one, Stick two, Stick expectedTemp) {
        assertEquals(Stick.temp(one, two), expectedTemp);
    }
}