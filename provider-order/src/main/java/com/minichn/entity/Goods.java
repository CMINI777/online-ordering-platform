package com.minichn.entity;

import lombok.Data;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@Data
public class Goods {
    private long id;
    private String name;
    private double price;
    private String details;
    private Type type;
}
