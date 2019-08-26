package com.minichn.controller;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import com.minichn.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@RestController
@RequestMapping("/goods")
public class GoodsHandler {
    @Value("${server.port}")
    private String port;

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }

    @GetMapping("/findAll/{page}/{limit}")
    public GoodsVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        GoodsVO goodsVO = new GoodsVO();
        goodsVO.setCode(0);
        goodsVO.setMsg("");
        goodsVO.setCount(goodsRepository.count());
        goodsVO.setData(goodsRepository.findAll((page-1)*limit,limit));
        return goodsVO;
    }
}
