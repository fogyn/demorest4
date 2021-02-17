package com.demo21.demorest4.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Order_Line")
public class Order_Line {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "order_id")
    private int order_id;
    @Column(name = "good_id")
    private int good_id;
    @Column(name = "count")
    private int count;

    public Order_Line(int order_id, int good_id, int count) {
        this.order_id = order_id;
        this.good_id = good_id;
        this.count = count;
    }

    public Order_Line(int id, int order_id, int good_id, int count) {
        this.id = id;
        this.order_id = order_id;
        this.good_id = good_id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
