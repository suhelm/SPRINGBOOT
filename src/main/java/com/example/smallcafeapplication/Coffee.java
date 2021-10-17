package com.example.smallcafeapplication;

public class Coffee {

    public Coffee(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    private String name;
    private double price;
    private int id;

    public Coffee(String name, double price,int id) {
        this.name = name;
        this.price = price;
        this.id=id;
    }

    public Object getId() {
        return id;
    }
}
