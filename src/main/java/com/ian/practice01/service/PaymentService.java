package com.ian.practice01.service;

import com.ian.practice01.dto.*;
import com.ian.practice01.type.*;

// 결제 서비스(편결이)
public class PaymentService {
    private static PaymentInterface paymentInterface;

    // 결제 기능 메서드
    public PayResponse processPayment(PayRequest payRequest) {
        Integer amount = payRequest.getAmount();

        // 결제 수단에 따른 어댑터 변경
        if (payRequest.getPayMethod() == PayMethodType.MONEY) {
            paymentInterface = new MoneyAdapter();
        } else {
            paymentInterface = new CardAdapter();
        }

        PaymentResult paymentResult = paymentInterface.payment(amount);

        // Fail Fast
        if (paymentResult == PaymentResult.PAYMENT_FAIL) {
            return new PayResponse(PayResult.PAY_FAIL, 0);
        }
        // Success Case(Only One)
        return new PayResponse(PayResult.PAY_SUCCESS, amount);
    }

    // 결제 취소 기능 메서드
    public PayCancleResponse canclePayment(PayCancleRequest payCancleRequest) {
        // 결제 수단에 따른 어댑터 변경
        if (payCancleRequest.getPayMethodType() == PayMethodType.MONEY) {
            paymentInterface = new MoneyAdapter();
        } else {
            paymentInterface = new CardAdapter();
        }

        PaymentCancleResult paymentCancleResult = paymentInterface.paymentCancle(payCancleRequest.getCancleAmount());

        // Fail Fast
        if (paymentCancleResult == PaymentCancleResult.PAYMENT_CANCLE_FAIL) {
            return new PayCancleResponse(PayCancleResult.PAY_CANCLE_FAIL, 0);
        }
        // Success Case(Only One)
        return new PayCancleResponse(PayCancleResult.PAY_CANCLE_SUCCESS, payCancleRequest.getCancleAmount());
    }
}
