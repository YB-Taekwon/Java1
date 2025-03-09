package com.ian.practice01.service;

import com.ian.practice01.dto.*;
import com.ian.practice01.type.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    static final PaymentService paymentService = new PaymentService();

    @Test
    void processPaymentSuccess() {
        // given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.G25, 3500);

        // when
        PayResponse payResponse = paymentService.processPayment(payRequest);

        // then
        assertEquals(PayResult.PAY_SUCCESS, payResponse.getPayResult());
        assertEquals(3500, payResponse.getPayAmount());
    }

    @Test
    void processPaymentFail() {
        // given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.G25, 100_0001);

        // when
        PayResponse payResponse = paymentService.processPayment(payRequest);

        // then
        assertEquals(PayResult.PAY_FAIL, payResponse.getPayResult());
        assertEquals(0, payResponse.getPayAmount());
    }

    @Test
    void canclePaymentSuccess() {
        // given
        PayCancleRequest payCancleRequest = new PayCancleRequest(PayMethodType.CARD, ConvenienceStoreType.G25, 3500);

        // when
        PayCancleResponse payCancleResponse = paymentService.canclePayment(payCancleRequest);

        // then
        assertEquals(PayCancleResult.PAY_CANCLE_SUCCESS, payCancleResponse.getPayCancleResult());
        assertEquals(3500, payCancleResponse.getPayCancleAmount());
    }

    @Test
    void canclePaymentFail() {
        // given
        PayCancleRequest payCancleRequest = new PayCancleRequest(PayMethodType.CARD, ConvenienceStoreType.G25, 50);

        // when
        PayCancleResponse payCancleResponse = paymentService.canclePayment(payCancleRequest);

        // then
        assertEquals(PayCancleResult.PAY_CANCLE_FAIL, payCancleResponse.getPayCancleResult());
        assertEquals(0, payCancleResponse.getPayCancleAmount());
    }
}