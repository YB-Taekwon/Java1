package com.ian.practice01.service;

import com.ian.practice01.dto.PayRequest;

public interface DiscountInterface {
    Integer getDiscountAmount(PayRequest payRequest);
}
