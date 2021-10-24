package com.example.demo.request;


import lombok.Data;

@Data
public class GoodsRequest {
    private Long goodsCd;
    private String goodsNm;
    private int price;
}
