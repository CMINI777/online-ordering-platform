package com.minichn.controller;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import com.minichn.feign.GoodsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/prepareSave")
    public String prepareSave(Model model){
        model.addAttribute("list",goodsFeign.findAllType());
        return "goods_add";
    }

    @PostMapping("/save")
    public String save(Goods goods){
        goodsFeign.save(goods);
        return "redirect:/account/redirect/goods_manage";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") long id,Model model){
        model.addAttribute("list",goodsFeign.findAllType());
        model.addAttribute("goods",goodsFeign.findById(id));
        return "goods_update";
    }

    @PostMapping("/update")
    public String update(Goods goods){
        goodsFeign.update(goods);
        return "redirect:/account/redirect/goods_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
//        orderFeign.deleteByMid(id);
        goodsFeign.deleteById(id);
        return "redirect:/account/redirect/goods_manage";
    }
}
