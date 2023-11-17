package com.hari.foods.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HariFoodsGraphqlController {

    @QueryMapping
    public List<String> items(){
        return null;
    }
}
