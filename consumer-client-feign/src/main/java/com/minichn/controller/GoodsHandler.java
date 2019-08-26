package com.minichn.controller;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import com.minichn.feign.GoodsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@Controller
@RequestMapping("/goods")
public class GoodsHandler {

    @Autowired
    private GoodsFeign goodsFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public GoodsVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return goodsFeign.findAll(page, limit);
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location) {
        return location;
    }
}
