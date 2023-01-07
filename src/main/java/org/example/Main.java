package org.example;

import com.yroom.simpleFactoryMode.baseClass.Operation;
import com.yroom.simpleFactoryMode.factory.OperationFactory;

public class Main {
    public static void main(String[] args) {
        Operation operation;

        operation = OperationFactory.createOperate("+");

        operation.setNumberA(1);
        operation.setNumberB(2);

        try {
            double result = operation.getResult();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}