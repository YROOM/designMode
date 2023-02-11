package com.yroom.visitorMode.yroom.book;

/**
 * @author rui.yang
 */
public abstract class Person {
    abstract void accept(Action visitor);
}
