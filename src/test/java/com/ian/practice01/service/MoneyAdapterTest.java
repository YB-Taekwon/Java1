package com.ian.practice01.service;

import com.ian.practice01.type.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyAdapterTest {
    static final MoneyAdapter moneyAdapter = new MoneyAdapter();

    @Test
    void useMoneyFail() {
        // given
        Integer money = 100_0001;

        // when
        MoneyUseResult moneyUseResult = moneyAdapter.useMoney(money);

        // then
        assertEquals(MoneyUseResult.MONEY_USE_FAIL, moneyUseResult);
    }

    @Test
    void useMoneySuccess() {
        // given
        Integer money = 3500;

        // when
        MoneyUseResult moneyUseResult = moneyAdapter.useMoney(money);

        // then
        assertEquals(MoneyUseResult.MONEY_USE_SUCCESS, moneyUseResult);
    }

    @Test
    void cancleUseMoneyFail() {
        // given
        Integer cancleMoney = 50;

        // when
        MoneyUseCancleResult moneyUseCancleResult = moneyAdapter.cancleUseMoney(cancleMoney);

        // then
        assertEquals(MoneyUseCancleResult.MONEY_USE_CANCLE_FAIL, moneyUseCancleResult);
    }

    @Test
    void cancleUseMoneySuccess() {
        // given
        Integer cancleMoney = 3500;

        // when
        MoneyUseCancleResult moneyUseCancleResult = moneyAdapter.cancleUseMoney(cancleMoney);

        // then
        assertEquals(MoneyUseCancleResult.MONEY_USE_CANCLE_SUCCESS, moneyUseCancleResult);
    }
}