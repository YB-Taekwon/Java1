package com.ian.practice01.service;

import com.ian.practice01.type.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAdapterTest {
    static final CardAdapter cardAdapter = new CardAdapter();

    @Test
    void settlementSuccess() {
        // given
        Integer amount = 3500;

        // when
        CardUseResult settlement = cardAdapter.settlement(amount);

        // then
        assertEquals(CardUseResult.CARD_USE_SUCCESS, settlement);
    }

    @Test
    void settlementFail() {
        // given
        Integer amount = 100_0001;

        // when
        CardUseResult settlement = cardAdapter.settlement(amount);

        // then
        assertEquals(CardUseResult.CARD_USE_FAIL, settlement);
    }

    @Test
    void refundSuccess() {
        // given
        Integer amount = 3500;

        // when
        CardUseCancleResult refund = cardAdapter.refund(amount);

        // then
        assertEquals(CardUseCancleResult.CARD_USE_CANCLE_SUCCESS, refund);
    }

    @Test
    void refundFail() {
        // given
        Integer amount = 50;

        // when
        CardUseCancleResult refund = cardAdapter.refund(amount);

        // then
        assertEquals(CardUseCancleResult.CARD_USE_CANCLE_FAIL, refund);
    }
}