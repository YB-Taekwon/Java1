package com.ian.practice01.dto;

import com.ian.practice01.type.ConvenienceStoreType;

public class PayRequest {
    // 필드
    private ConvenienceStoreType convenienceStoreType; // 편의점 종류
    private Integer amount; // 결제 금액

    // 생성자
    public PayRequest(ConvenienceStoreType convenienceStoreType, Integer amount) {
        this.convenienceStoreType = convenienceStoreType;
        this.amount = amount;
    }

    // Getter & Setter
    public ConvenienceStoreType getConvenienceStoreType() {
        return convenienceStoreType;
    }

    public void setConvenienceStoreType(ConvenienceStoreType convenienceStoreType) {
        this.convenienceStoreType = convenienceStoreType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}