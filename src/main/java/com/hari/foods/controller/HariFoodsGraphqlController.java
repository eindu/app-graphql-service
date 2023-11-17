package com.hari.foods.controller;

import com.hari.foods.entitys.Item;
import com.hari.foods.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HariFoodsGraphqlController {

    @Autowired
    ItemService itemService;
    @QueryMapping
    public List<Item> items(){
        return itemService.getItems();
    }

    @QueryMapping
    public List<Item> item(@Argument String type){
        if(!ObjectUtils.isEmpty(type)){
          return itemService.getItem(type);
        }
        return null;
    }
}
