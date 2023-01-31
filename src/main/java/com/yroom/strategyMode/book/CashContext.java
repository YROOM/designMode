package com.yroom.strategyMode.book;

import com.yroom.strategyMode.practice.AbstractCashSuper;

/**
 * @author rui.yang
 */
public class CashContext {
    private AbstractCashSuper abstractCashSuper;

    public CashContext(AbstractCashSuper abstractCashSuper) {
        this.abstractCashSuper = abstractCashSuper;
    }


    public double getResult(double money) {
        return abstractCashSuper.acceptCash(money);
    }

}
