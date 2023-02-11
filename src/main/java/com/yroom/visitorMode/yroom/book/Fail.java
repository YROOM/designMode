package com.yroom.visitorMode.yroom.book;


public class Fail extends Action {
    @Override
    void getManConclusion(Man concreteElementA) {
        String name = concreteElementA.getClass().getName();
        String status = this.getClass().getName();
        System.out.println(String.format("%s %s时，男人巴拉巴拉", name, status));

    }

    @Override
    void getWomanConclusion(Woman concreateElementB) {
        String name = concreateElementB.getClass().getName();
        String status = this.getClass().getName();
        System.out.println(String.format("%s %s时，女人巴拉巴拉", name, status));
    }
}
