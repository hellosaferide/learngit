package com.bjsxt.dao;

import com.bjsxt.pojo.Flower;

import java.util.List;

public interface FlowerDao {
    /**
     * 查询全部
     * @return List<Flower>
     */
    public List<Flower> selAll();

    /**
     * 插入花卉
     * @return
     */
    public int insFlower(Flower flower);
}
