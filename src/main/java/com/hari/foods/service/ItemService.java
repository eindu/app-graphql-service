package com.hari.foods.service;

import com.hari.foods.entitys.Item;
import com.hari.foods.repository.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemsRepo itemsRepo;
    public List<Item> getItems(){
       return itemsRepo.findAll();
    }

    public List<Item> getItem(String type){
        return itemsRepo.findByType(type);
    }
}
