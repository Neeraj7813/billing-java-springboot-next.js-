package com.shop.shop_backend.controller;

import com.shop.shop_backend.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")  // Important for frontend to connect
@RestController
@RequestMapping("/items")
public class ItemController {

    private final List<Item> itemList = new ArrayList<>();

    @GetMapping
    public List<Item> getItems() {
        return itemList;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        item.setId((long) (itemList.size() + 1));
        item.setPricePerUnit(getPrice(item.getName())); // 👈 set price here
        itemList.add(item);
        return item;
    }

    @GetMapping("/bill")
    public double getBill() {
        return itemList.stream()
                .mapToDouble(i -> i.getQuantity() * i.getPricePerUnit())
                .sum();
    }

    private double getPrice(String name) {
        return switch (name.toLowerCase()) {
            case "apple" -> 10.0;
            case "banana" -> 5.0;
            case "orange" -> 8.0;
            case "mango" -> 12.0;
            default -> 15.0; 
        };
    }
}
