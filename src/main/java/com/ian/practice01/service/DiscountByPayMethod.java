package com.ian.practice01.service;

import com.ian.practice01.dto.PayRequest;

public class DiscountByPayMethod implements DiscountInterface {

    @Override
    public Integer getDiscountAmount(PayRequest payRequest) {
        switch (payRequest.getPayMethodType()) {
            case MONEY:
                return payRequest.getAmount() * 7 / 10;
            case CARD:
                return payRequest.getAmount();
        }
        return payRequest.getAmount();
    }
}
