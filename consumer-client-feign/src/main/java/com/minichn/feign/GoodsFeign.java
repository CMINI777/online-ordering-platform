package com.minichn.feign;

import com.minichn.entity.Goods;
import com.minichn.entity.GoodsVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
@FeignClient(value = "goods")
public interface GoodsFeign {
    @GetMapping("/goods/findAll/{page}/{limit}")
    public GoodsVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);
}
