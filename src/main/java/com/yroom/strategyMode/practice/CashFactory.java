package com.yroom.strategyMode.practice;

public class CashFactory {
    public static AbstractCashSuper createCashAccept(String type) {
        AbstractCashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                CashReturn cr1 = new CashReturn("300", "100");
                cs = cr1;
                break;

            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }
        return cs;

    }
}
