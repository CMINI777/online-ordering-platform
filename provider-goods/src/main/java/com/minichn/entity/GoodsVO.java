package com.minichn.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by minichn on 2019/8/26 0026.
 */
@Data
public class GoodsVO {
    private int code;
    private String msg;
    private int count;
    private List<Goods> data;
}
