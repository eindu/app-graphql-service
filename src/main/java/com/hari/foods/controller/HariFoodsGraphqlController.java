package com.hari.foods.controller;

import com.hari.foods.model.Item;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HariFoodsGraphqlController {

    @QueryMapping
    public List<Item> items(){
        Item item = new Item();
        item.setName("Chicken");
        item.setPrice(300f);
        item.setType("Nonveg");
        Item item2 = new Item();
        item2.setName("Mutton");
        item2.setPrice(300f);
        item2.setType("Nonveg");
        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        return items;
    }
}
