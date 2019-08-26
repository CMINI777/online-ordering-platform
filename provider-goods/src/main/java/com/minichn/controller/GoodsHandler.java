package com.minichn.controller;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import com.minichn.entity.Type;
import com.minichn.repository.GoodsRepository;
import com.minichn.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@RestController
@RequestMapping("/goods")
public class GoodsHandler {

    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/findAll/{page}/{limit}")
    public GoodsVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        GoodsVO goodsVO = new GoodsVO();
        goodsVO.setCode(0);
        goodsVO.setMsg("");
        goodsVO.setCount(goodsRepository.count());
        goodsVO.setData(goodsRepository.findAll((page-1)*limit,limit));
        return goodsVO;
    }

    @GetMapping("/findAllType")
    public List<Type> findAllType(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Goods goods){
        goodsRepository.save(goods);
    }

    @GetMapping("/findById/{id}")
    public Goods findById(@PathVariable("id") long id){
        return goodsRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Goods goods){
        goodsRepository.update(goods);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        goodsRepository.deleteById(id);
    }

}
