package com.ian.practice01.service;

import com.ian.practice01.dto.PayRequest;

public class DiscountByConvenienceStore implements DiscountInterface {
    @Override
    public Integer getDiscountAmount(PayRequest payRequest) {
        switch (payRequest.getConvenienceStoreType()) {
            case G25:
                return payRequest.getAmount() * 8 / 10;
            case GU:
                return payRequest.getAmount() * 9 / 10;
            case SEVEN:
                return payRequest.getAmount();
        }
        return payRequest.getAmount();
    }
}
