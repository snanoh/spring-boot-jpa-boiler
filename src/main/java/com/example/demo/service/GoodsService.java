package com.example.demo.service;

import com.example.demo.entity.Goods;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.request.GoodsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    public List<Goods> searchGoods() {
        List<Goods> goodsList = goodsRepository.findAll();
        return goodsList;
    }

    public void saveGoods(Goods goods) {
        goodsRepository.save(goods);
    }
}
