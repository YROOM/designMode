package com.yroom.visitorMode.yroom.book;

import com.yroom.visitorMode.yroom.book.Man;
import com.yroom.visitorMode.yroom.book.Woman;

/**
 * @author rui.yang
 */
public abstract class Action {
    abstract void getManConclusion(Man ConcreteElementA);

    abstract void getWomanConclusion(Woman concreateElementB);

}
