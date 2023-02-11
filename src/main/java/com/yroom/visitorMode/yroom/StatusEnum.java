package com.yroom.visitorMode.yroom;

/**
 * @author rui.yang
 */

public enum StatusEnum {
    SUCCESS("success"),
    FAIL("fail"),
    BREAK("break");

    private String status;


    StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
