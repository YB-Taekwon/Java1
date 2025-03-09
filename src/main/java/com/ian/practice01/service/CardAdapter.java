package com.ian.practice01.service;

import com.ian.practice01.type.*;

// 카드 어댑터
public class CardAdapter implements PaymentInterface {
    // 인증 기능 메서드
    public void authorization() {
        System.out.println("authorization is success");
    }

    // 승인 기능 메서드
    public void capture() {
        System.out.println("capture is success");
    }

    // 매입 기능 메서드
    public CardUseResult settlement(Integer payAmount) {
        // 결제 금액이 100만원 초과일 경우, 결제 불가능
        if (payAmount > 100_0000) {
            return CardUseResult.CARD_USE_FAIL;
        }
        // 결제 성공
        return CardUseResult.CARD_USE_SUCCESS;
    }

    // 매입 취소 기능 메서드
    public CardUseCancleResult refund(Integer cancleAmount) {
        // 결제 취소 금액이 100원 미만일 경우, 결제 취소 불가능
        if (cancleAmount < 100) {
            return CardUseCancleResult.CARD_USE_CANCLE_FAIL;
        }
        return CardUseCancleResult.CARD_USE_CANCLE_SUCCESS;
    }

    // 결제 수단 사용 메서드 재정의
    @Override
    public PaymentResult payment(Integer payAmount) {
        authorization();
        capture();
        CardUseResult cardUseResult = settlement(payAmount);

        if (cardUseResult == CardUseResult.CARD_USE_FAIL) {
            return PaymentResult.PAYMENT_FAIL;
        }
        return PaymentResult.PAYMENT_SUCCESS;
    }

    // 결제 수단 사용 취소 메서드 재정의
    @Override
    public PaymentCancleResult paymentCancle(Integer cancleAmount) {
        CardUseCancleResult cardUseCancleResult = refund(cancleAmount);

        if (cardUseCancleResult == CardUseCancleResult.CARD_USE_CANCLE_FAIL) {
            return PaymentCancleResult.PAYMENT_CANCLE_FAIL;
        }
        return PaymentCancleResult.PAYMENT_CANCLE_SUCCESS;
    }
}
