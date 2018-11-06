package com.bjsxt.service;

import com.bjsxt.pojo.Flower;

import java.util.List;

public interface FlowerService {
    /**
     * 显示所有花的信息
     * @return
     */
    public List<Flower> show();

    /**
     * 添加花卉
     * @return int
     * @param flower
     */
    public int add(Flower flower);
}
