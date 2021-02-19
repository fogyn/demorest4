package com.demo21.demorest4.entity;


import com.sun.istack.NotNull;

public class GoodRequest {
    @NotNull
    private int goodid;
    @NotNull
    private String name;
    @NotNull
    private float price;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
