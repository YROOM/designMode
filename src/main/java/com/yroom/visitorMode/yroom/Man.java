package com.yroom.visitorMode.yroom;

import java.util.Objects;

/**
 * @author rui.yang
 */
public class Man extends AbstractPerson {

    @Override
    String getStatusBySex(String status) {

        if (Objects.equals(status, StatusEnum.SUCCESS.getStatus())) {
            return String.format("男人 %s,XXXX", status);
        } else {
            return "yroomMan";
        }

    }
}
