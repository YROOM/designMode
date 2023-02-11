package com.yroom.visitorMode.yroom;

import com.yroom.visitorMode.yroom.book.Man;
import com.yroom.visitorMode.yroom.book.ObjectStructure;
import com.yroom.visitorMode.yroom.book.Success;
import com.yroom.visitorMode.yroom.book.Woman;

public class Test {
    public static void main(String[] args) {
     /*   Man yroom = new Man();
        System.out.println(yroom.getStatusBySex(StatusEnum.SUCCESS.getStatus()));*/

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();

        objectStructure.disPlay(success);


    }
}
