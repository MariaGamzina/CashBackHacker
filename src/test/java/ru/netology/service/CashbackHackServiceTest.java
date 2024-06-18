package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;



public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnRemainMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldNotReturnRemainIfAmountEquelsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

}
