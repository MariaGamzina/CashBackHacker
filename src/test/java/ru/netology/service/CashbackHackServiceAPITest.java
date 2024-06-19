package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceAPITest {
    @Test
    public void shouldReturnRemainLessBoundaryAPI() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldReturnRemainMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotReturnRemainIfAmountEquelsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
}
}