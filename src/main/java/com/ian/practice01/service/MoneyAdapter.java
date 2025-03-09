package com.ian.practice01.service;

import com.ian.practice01.type.MoneyUseCancleResult;
import com.ian.practice01.type.MoneyUseResult;

// 머니 어댑터
public class MoneyAdapter {
    // 머니 사용 기능 메서드
    public MoneyUseResult useMoney(Integer money) {
        // 결제 금액이 100만원 초과일 경우, 결체 불가능
        if (money > 100_0000) {
            return MoneyUseResult.MONEY_USE_FAIL;
        }
        // 결제 성공
        return MoneyUseResult.MONEY_USE_SUCCESS;
    }

    // 머니 사용 취소 메서드
    public MoneyUseCancleResult cancleUseMoney(Integer cancleMoney) {
        // 취소 금액이 100원 이하일 경우, 결제 취소 불가능
        if (cancleMoney < 100) {
            return MoneyUseCancleResult.MONEY_USE_CANCLE_FAIL;
        }
        // 결제 성공
        return MoneyUseCancleResult.MONEY_USE_CANCLE_SUCCESS;
    }
}
