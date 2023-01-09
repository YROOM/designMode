package com.yroom.strategyMode.practice;

/**
 * @author rui.yang
 */
public class Main {
    public static void main(String[] args) {
        AbstractCashSuper cs = CashFactory.createCashAccept("打8折");
        double totalPrices = 100d;
        double v = cs.acceptCash(totalPrices);
        System.out.println(v);


    }
}
