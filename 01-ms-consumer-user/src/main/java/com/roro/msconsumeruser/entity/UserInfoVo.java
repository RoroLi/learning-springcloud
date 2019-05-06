package com.roro.msconsumeruser.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoVo {

    private String userName;

    private List<OrderVo> orderVoList;
}
