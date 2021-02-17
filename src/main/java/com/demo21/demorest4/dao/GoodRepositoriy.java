package com.demo21.demorest4.dao;

import com.demo21.demorest4.entity.Good;
import com.demo21.demorest4.entity.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepositoriy extends JpaRepository<Good, Integer> {
}
