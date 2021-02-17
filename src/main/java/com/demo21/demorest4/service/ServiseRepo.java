package com.demo21.demorest4.service;

import com.demo21.demorest4.dao.GoodRepositoriy;
import com.demo21.demorest4.dao.OrderRepositoriy;
import com.demo21.demorest4.entity.Good;
import com.demo21.demorest4.entity.Order_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiseRepo implements ServiceRepositoriy{

    @Autowired
    private OrderRepositoriy orderRepo;
    @Autowired
    private GoodRepositoriy goodRepo;


    @Override
    public Optional<Good> getGoodById(int id) {
        //goodRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));

        return this.goodRepo.findById(id);
    }

    @Override
    public void deleteGoodbyId(int id) {
        goodRepo.deleteById(id);
    }

    @Override
    public void updateGoodById(Good upgood, int id) {
        goodRepo.findById(id).map(good -> {
                    good.setName(upgood.getName());
                    good.setPrice(upgood.getPrice());
                    return goodRepo.save(good);
                });

//        goodRepo.findById(id)
//                .map(good -> {
//                    good.setName(upgood.getName());
//                    good.setPrice(upgood.getPrice());
//                    return goodRepo.save(good);
//                })
//                .orElseGet(() -> {
//                    upgood.setGood_id(id);
//                    return goodRepo.save(upgood);
//                });

    }

    @Override
    public List<Order_> getAllOrders() {
        return this.orderRepo.findAll();
    }

    @Override
    public List<Good> getAllGoods() {
        return this.goodRepo.findAll();
    }

    @Override
    public void newGood(Good good) {
        goodRepo.save(good);
    }
}
