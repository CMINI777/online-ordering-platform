package com.minichn.feign;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import com.minichn.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@FeignClient(value = "goods")
public interface GoodsFeign {

    @GetMapping("/goods/findAll/{page}/{limit}")
    public GoodsVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @GetMapping("/goods/findAllType")
    public List<Type> findAllType();

    @PostMapping("/goods/save")
    public void save(@RequestBody Goods goods);

    @GetMapping("/goods/findById/{id}")
    public Goods findById(@PathVariable("id") long id);

    @PutMapping("/goods/update")
    public void update(@RequestBody Goods goods);

    @DeleteMapping("/goods/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
