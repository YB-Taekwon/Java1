package com.ian.practice01.dto;

import com.ian.practice01.type.ConvenienceStoreType;
import com.ian.practice01.type.PayMethodType;

public class PayCancleRequest {
    // 필드
    private ConvenienceStoreType convenienceStoreType; // 편의점 종류
    private Integer cancleAmount; // 결제 취소 금액
    private PayMethodType payMethodType; // 결제 수단

    // 생성자
    public PayCancleRequest(PayMethodType payMethodType, ConvenienceStoreType convenienceStoreType, Integer cancleAmount) {
        this.payMethodType = payMethodType;
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

    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(PayMethodType payMethodType) {
        this.payMethodType = payMethodType;
    }
}
