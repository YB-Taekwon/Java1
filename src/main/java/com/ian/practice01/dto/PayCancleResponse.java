package com.ian.practice01.dto;

import com.ian.practice01.type.PayCancleResult;

public class PayCancleResponse {
    // 필드
    private PayCancleResult payCancleResult; // 결제 취소 결과
    private Integer payCancleAmount; // 결제 취소 성공 금액

    // 생성자
    public PayCancleResponse(PayCancleResult payCancleResult, Integer payCancleAmount) {
        this.payCancleResult = payCancleResult;
        this.payCancleAmount = payCancleAmount;
    }

    // Getter & Setter
    public PayCancleResult getPayCancleResult() {
        return payCancleResult;
    }

    public void setPayCancleResult(PayCancleResult payCancleResult) {
        this.payCancleResult = payCancleResult;
    }

    public Integer getPayCancleAmount() {
        return payCancleAmount;
    }

    public void setPayCancleAmount(Integer payCancleAmount) {
        this.payCancleAmount = payCancleAmount;
    }

    // toString
    @Override
    public String toString() {
        return "PayCancleResponse{" +
                "payCancleResult=" + payCancleResult +
                ", payCancleAmount=" + payCancleAmount +
                '}';
    }
}
