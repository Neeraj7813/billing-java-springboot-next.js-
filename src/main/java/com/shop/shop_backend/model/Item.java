package com.shop.shop_backend.model;

public class Item {
    private Long id;
    private String name;
    private int quantity;
    private double pricePerUnit;

    public Item() {}

    public Item(Long id, String name, int quantity, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPricePerUnit() { return pricePerUnit; }
    public void setPricePerUnit(double pricePerUnit) { this.pricePerUnit = pricePerUnit; }
}
