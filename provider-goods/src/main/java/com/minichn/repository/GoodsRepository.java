package com.minichn.repository;

import com.minichn.entity.Goods;

import java.util.List;

/**
 * Created by minichn on 2019/8/24 0024.
 */
public interface GoodsRepository {
    public List<Goods> findAll(int index,int limit);
    public int count();
    public Goods findById(long id);
    public void save(Goods goods);
    public void update(Goods goods);
    public void deleteById(long id);
}
