package com.ian.practice01.service;

import com.ian.practice01.type.PaymentCancleResult;
import com.ian.practice01.type.PaymentResult;

public interface PaymentInterface {
    // 결제 수단 사용 메서드
    PaymentResult payment(Integer payAmount);
    // 결제 수단 사용 취소 메서드
    PaymentCancleResult paymentCancle(Integer cancleAmount);
}
