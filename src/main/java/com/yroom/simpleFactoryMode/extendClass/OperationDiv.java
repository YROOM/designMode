package com.yroom.simpleFactoryMode.extendClass;

import com.yroom.simpleFactoryMode.baseClass.AbstractClassOperation;
import com.yroom.simpleFactoryMode.baseClass.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if (this.getNumberB() == 0) {
            throw new Exception("被除数不能为0");
        }
        return this.getNumberA() / this.getNumberB();
    }
}
