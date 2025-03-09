package com.ian.practice01;

import com.ian.practice01.dto.*;
import com.ian.practice01.service.PaymentService;
import com.ian.practice01.type.ConvenienceStoreType;
import com.ian.practice01.type.PayMethodType;

// 사용자 -> 편결이 -> 머니
public class UserClient {
    public static void main(String[] args) {
        // 편결이(결제 서비스)
        PaymentService service = new PaymentService();

        // 결제 기능 - 결제 수단: 현금, 편의점: G25, 결제 금액: 1000원
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.G25, 1000);
        PayResponse payResponse = service.processPayment(payRequest);
        System.out.println("payResponse = " + payResponse);

        System.out.println();

        // 결제 취소 - 결제 수단: 카드, 편의점: GU, 결제 취소 금액: 500원
        PayCancleRequest payCancleRequest = new PayCancleRequest(PayMethodType.CARD, ConvenienceStoreType.GU, 50);
        PayCancleResponse payCancleResponse = service.canclePayment(payCancleRequest);
        System.out.println("payCancleResponse = " + payCancleResponse);
    }
}