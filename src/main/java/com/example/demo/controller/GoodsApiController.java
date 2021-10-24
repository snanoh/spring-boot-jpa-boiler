package com.example.demo.controller;


import com.example.demo.entity.Goods;
import com.example.demo.request.GoodsRequest;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GoodsApiController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("")
    public List<Goods> goodsNameGet(){
        return goodsService.searchGoods();
    }

    @PostMapping("")
    public void saveGoods(@RequestBody Goods goods){
        goodsService.saveGoods(goods);
    }
}
