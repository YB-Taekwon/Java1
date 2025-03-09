package com.ian.practice01.service;

import com.ian.practice01.dto.*;
import com.ian.practice01.type.*;

// 결제 서비스(편결이)
public class PaymentService {
    // 머니 어댑터 의존성 주입
    private static final MoneyAdapter moneyAdapter = new MoneyAdapter();

    // 결제 기능 메서드
    public PayResponse processPayment(PayRequest payRequest) {
        Integer amount = payRequest.getAmount();
        MoneyUseResult moneyUseResult = moneyAdapter.useMoney(amount);

        // Fail Fast
        if(moneyUseResult == MoneyUseResult.MONEY_USE_FAIL) {
            return new PayResponse(PayResult.PAY_FAIL, 0);
        }
        // Success Case(Only One)
        return new PayResponse(PayResult.PAY_SUCCESS, amount);
    }

    // 결제 취소 기능 메서드
    public PayCancleResponse canclePayment(PayCancleRequest payCancleRequest) {
        MoneyUseCancleResult moneyUseCancleResult = moneyAdapter.cancleUseMoney(payCancleRequest.getCancleAmount());

        // Fail Fast
        if(moneyUseCancleResult == MoneyUseCancleResult.MONEY_USE_CANCLE_FAIL) {
            return new PayCancleResponse(PayCancleResult.PAY_CANCLE_FAIL, 0);
        }
        // Success Case(Only One)
        return new PayCancleResponse(PayCancleResult.PAY_CANCLE_SUCCESS, payCancleRequest.getCancleAmount());
    }
}
