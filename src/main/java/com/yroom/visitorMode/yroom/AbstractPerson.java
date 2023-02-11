package com.yroom.visitorMode.yroom;

/**
 * @author rui.yang
 */
public abstract class AbstractPerson {

    private String sex;
    private String status;


    abstract String getStatusBySex(String status);

}
