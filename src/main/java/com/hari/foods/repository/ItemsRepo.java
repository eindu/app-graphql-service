package com.hari.foods.repository;

import com.hari.foods.entitys.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepo extends JpaRepository<Item,Long> {

    List<Item> findByType(String type);
}
