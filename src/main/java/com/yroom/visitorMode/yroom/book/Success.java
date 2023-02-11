package com.yroom.visitorMode.yroom.book;



/**
 * @author rui.yang
 */
public class Success extends Action {
    @Override
    void getManConclusion(Man concreteElementA) {
        String name = concreteElementA.getClass().getSimpleName();
        String status = this.getClass().getSimpleName();
        System.out.println(String.format("%s %s时，背后多半有一个伟大的女人", name, status));

    }

    @Override
    void getWomanConclusion(Woman conCreateElementB) {
        String name = conCreateElementB.getClass().getName();
        String status = this.getClass().getName();
        System.out.println(String.format("%s %s时，背后多半有一个不成功的男人", name, status));
    }
}
