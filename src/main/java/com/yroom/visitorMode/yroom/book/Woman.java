package com.yroom.visitorMode.yroom.book;

public class Woman extends Person {
    @Override
    void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
