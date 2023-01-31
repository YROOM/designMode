package com.yroom.decoratorMode.book;

/**
 * @author rui.yang
 */
public class Main {
    public static void main(String[] args) {
      /*  ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();*/


        Person yroom = new Person("yroom");
        System.out.println("第一种装扮");

        TShirts yyk = new TShirts();
        BigTrouser kk = new BigTrouser();

        kk.decorate(yroom);
        yyk.decorate(yyk);

    }
}
