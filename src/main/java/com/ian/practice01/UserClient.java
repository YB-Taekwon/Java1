package com.ian.practice01;

import com.ian.practice01.dto.*;
import com.ian.practice01.service.PaymentService;
import com.ian.practice01.type.ConvenienceStoreType;

// 사용자 -> 편결이 -> 머니
public class UserClient {
    public static void main(String[] args) {
        // 편결이(결제 서비스)
        PaymentService service = new PaymentService();

        // 결제 기능 - 편의점: G25, 결제 금액: 1000원
        PayRequest payRequest = new PayRequest(ConvenienceStoreType.G25, 1000);
        PayResponse payResponse = service.processPayment(payRequest);
        System.out.println("payResponse = " + payResponse);

        System.out.println();

        // 결제 취소 - 편의점: GU, 결제 취소 금액: 500원
        PayCancleRequest payCancleRequest = new PayCancleRequest(ConvenienceStoreType.GU, 500);
        PayCancleResponse payCancleResponse = service.canclePayment(payCancleRequest);
        System.out.println("payCancleResponse = " + payCancleResponse);
    }
}