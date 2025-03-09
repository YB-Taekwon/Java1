package com.ian.practice01.dto;

import com.ian.practice01.type.PayResult;

public class PayResponse {
    // 필드
    private PayResult payResult; // 결제 결과
    private Integer payAmount; // 결제 성공 금액

    // 생성자
    public PayResponse(PayResult payResult, Integer payAmount) {
        this.payResult = payResult;
        this.payAmount = payAmount;
    }

    // Getter & Setter
    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    // toString
    @Override
    public String toString() {
        return "PayResponse{" +
                "payResult=" + payResult +
                ", payAmount=" + payAmount +
                '}';
    }
}