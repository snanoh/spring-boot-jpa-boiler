package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="GOODS")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long goodsCd;

    @Column(name="GOODS_NM")
    private String goodsNm;

    @Column(name="PRICE")
    private int price;
}
