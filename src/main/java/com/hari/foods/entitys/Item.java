package com.hari.foods.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "ITEMS")
@Entity(name = "Item")
public class Item {

    @Id
    @Column(name = "ITEM_NO")
    private Long itemId;
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "TYPE")
    private String type;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "ITEM_TYPE")
    private String itemType;
}
