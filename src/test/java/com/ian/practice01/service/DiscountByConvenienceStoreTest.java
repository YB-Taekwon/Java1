package com.ian.practice01.service;

import com.ian.practice01.dto.PayRequest;
import com.ian.practice01.type.ConvenienceStoreType;
import com.ian.practice01.type.PayMethodType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountByConvenienceStoreTest {
    static final DiscountByConvenienceStore discountByConvenienceStore = new DiscountByConvenienceStore();

    @Test
    void discountTest() {
        // given
        PayRequest payRequestG25 = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.G25, 10000);
        PayRequest payRequestGU = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.GU, 10000);
        PayRequest payRequestSEVEN = new PayRequest(PayMethodType.MONEY, ConvenienceStoreType.SEVEN, 10000);

        // when
        Integer discountAmount1 = discountByConvenienceStore.getDiscountAmount(payRequestG25);
        Integer discountAmount2 = discountByConvenienceStore.getDiscountAmount(payRequestGU);
        Integer discountAmount3 = discountByConvenienceStore.getDiscountAmount(payRequestSEVEN);

        // then
        assertEquals(8000, discountAmount1);
        assertEquals(9000, discountAmount2);
        assertEquals(10000, discountAmount3);
    }

}