package com.demo21.demorest4.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Goods")
public class Good {
    @Id
    @Column(name = "good_id")
    private int goodid;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;

    public Good() {
    }

    public Good(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Good(int id, String name, float price) {
        this.goodid = id;
        this.name = name;
        this.price = price;
    }

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
