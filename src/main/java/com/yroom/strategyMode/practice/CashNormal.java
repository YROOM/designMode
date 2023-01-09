package com.yroom.strategyMode.practice;

/**
 * @author rui.yang
 */
public class CashNormal extends AbstractCashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
