package com.demo21.demorest4.entity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "Order_")
public class Order_ {
    @Id
    @Column(name = "order_id")
    private int order_id;
    @Column(name = "client")
    private String client;
    @Column(name = "date")
    private Date date;
    @Column(name = "address")
    private String address;

    public Order_(){}

    public Order_(String client, Date date, String address) {
        this.client = client;
        this.date = date;
        this.address = address;
    }

    public Order_(int id, String client, Date date, String address) {
        this.order_id = id;
        this.client = client;
        this.date = date;
        this.address = address;
    }

    public int getId() {
        return order_id;
    }

    public void setId(int id) {
        this.order_id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
