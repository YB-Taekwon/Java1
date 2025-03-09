package com.ian.practice01.dto;

import com.ian.practice01.type.ConvenienceStoreType;

public class PayCancleRequest {
    // 필드
    private ConvenienceStoreType convenienceStoreType; // 편의점 종류
    private Integer cancleAmount; // 결제 취소 금액

    // 생성자
    public PayCancleRequest(ConvenienceStoreType convenienceStoreType, Integer cancleAmount) {
        this.convenienceStoreType = convenienceStoreType;
        this.cancleAmount = cancleAmount;
    }

    // Getter & Setter
    public ConvenienceStoreType getConvenienceStoreType() {
        return convenienceStoreType;
    }

    public void setConvenienceStoreType(ConvenienceStoreType convenienceStoreType) {
        this.convenienceStoreType = convenienceStoreType;
    }

    public Integer getCancleAmount() {
        return cancleAmount;
    }

    public void setCancleAmount(Integer cancleAmount) {
        this.cancleAmount = cancleAmount;
    }
}
