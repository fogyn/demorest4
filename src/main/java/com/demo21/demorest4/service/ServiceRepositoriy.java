package com.demo21.demorest4.service;

import com.demo21.demorest4.entity.Good;
import com.demo21.demorest4.entity.Order_;

import java.util.List;
import java.util.Optional;

public interface ServiceRepositoriy {
    List<Order_> getAllOrders();
    List<Good> getAllGoods();
    void newGood(Good good);
    Optional<Good> getGoodById(int id);
    void deleteGoodbyId(int id);
    void updateGoodById(Good upgood, int id);

}
