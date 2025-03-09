package com.ian.practice01.service;

import com.ian.practice01.type.*;

// 머니 어댑터
public class MoneyAdapter implements PaymentInterface {

    // 머니 사용 메서드
    public MoneyUseResult useMoney(Integer payAmount) {
        // 결제 금액이 100만원 초과일 경우, 결체 불가능
        if (payAmount > 100_0000) {
            return MoneyUseResult.MONEY_USE_FAIL;
        }
        // 결제 성공
        return MoneyUseResult.MONEY_USE_SUCCESS;
    }

    // 머니 사용 취소 메서드
    public MoneyUseCancleResult cancleUseMoney(Integer cancleMoney) {
        // 취소 금액이 100원 이하일 경우, 결제 취소 불가능
        if (cancleMoney < 100) {
            return MoneyUseCancleResult.MONEY_USE_CANCLE_FAIL;
        }
        // 결제 성공
        return MoneyUseCancleResult.MONEY_USE_CANCLE_SUCCESS;
    }

    // 결제 수단 사용 메서드 재정의
    @Override
    public PaymentResult payment(Integer payAmount) {
        MoneyUseResult moneyUseResult = useMoney(payAmount);

        if (moneyUseResult == MoneyUseResult.MONEY_USE_FAIL) {
            return PaymentResult.PAYMENT_FAIL;
        }
        return PaymentResult.PAYMENT_SUCCESS;
    }

    // 결제 수단 사용 취소 메서드 재정의
    @Override
    public PaymentCancleResult paymentCancle(Integer cancleAmount) {
        MoneyUseCancleResult moneyUseCancleResult = cancleUseMoney(cancleAmount);

        if (moneyUseCancleResult == MoneyUseCancleResult.MONEY_USE_CANCLE_FAIL) {
            return PaymentCancleResult.PAYMENT_CANCLE_FAIL;
        }
        return PaymentCancleResult.PAYMENT_CANCLE_SUCCESS;
    }
}
