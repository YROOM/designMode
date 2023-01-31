package com.yroom.decoratorMode.book;

/**
 * @author rui.yang
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }

    }


}
