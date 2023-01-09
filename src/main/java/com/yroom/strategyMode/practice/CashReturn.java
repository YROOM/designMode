package com.yroom.strategyMode.practice;

/**
 * @author rui.yang
 */
public class CashReturn extends AbstractCashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition) {
            return money - moneyReturn;
        } else {
            return money;
        }
    }
}
