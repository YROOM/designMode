package com.yroom.simpleFactoryMode.factory;

import com.yroom.simpleFactoryMode.baseClass.Operation;
import com.yroom.simpleFactoryMode.extendClass.OperationAdd;
import com.yroom.simpleFactoryMode.extendClass.OperationDiv;
import com.yroom.simpleFactoryMode.extendClass.OperationMul;
import com.yroom.simpleFactoryMode.extendClass.OperationSub;

public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}
