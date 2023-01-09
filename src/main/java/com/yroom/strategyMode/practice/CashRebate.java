package com.yroom.strategyMode.practice;

/**
 * @author rui.yang
 */
public class CashRebate extends AbstractCashSuper {

    private double moneyRebate = 1d;


    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
