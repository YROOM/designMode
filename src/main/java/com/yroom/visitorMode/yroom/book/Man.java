package com.yroom.visitorMode.yroom.book;

public class Man extends Person{
    @Override
    void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
