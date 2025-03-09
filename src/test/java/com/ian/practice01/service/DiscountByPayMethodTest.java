package com.ian.practice01.service;

import com.ian.practice01.dto.PayRequest;
import com.ian.practice01.type.ConvenienceStoreType;
import com.ian.practice01.type.PayMethodType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountByPayMethodTest {
    static final DiscountByPayMethod discountByPayMethod = new DiscountByPayMethod();
    
    @Test
    void discountTest() {
        // given
        PayRequest payRequestMoney = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.G25, 10000);
        PayRequest payRequestCard = new PayRequest(PayMethodType.CARD, ConvenienceStoreType.G25, 10000);
        
        // when
        Integer discountAmount1 = discountByPayMethod.getDiscountAmount(payRequestMoney);
        Integer discountAmount2 = discountByPayMethod.getDiscountAmount(payRequestCard);

        // then
        assertEquals(7000, discountAmount1);
        assertEquals(10000, discountAmount2);
    }
}