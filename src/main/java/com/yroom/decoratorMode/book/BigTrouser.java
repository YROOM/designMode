package com.yroom.decoratorMode.book;

/**
 * @author rui.yang
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
