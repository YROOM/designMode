package com.yroom.simpleFactoryMode.extendClass;

import com.yroom.simpleFactoryMode.baseClass.AbstractClassOperation;
import com.yroom.simpleFactoryMode.baseClass.Operation;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}
