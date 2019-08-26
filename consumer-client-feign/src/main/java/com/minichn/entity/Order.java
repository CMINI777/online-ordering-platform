package com.minichn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long id;
    private User user;
    private Goods goods;
    private Admin admin;
    private Date date;
    private int state;
}
