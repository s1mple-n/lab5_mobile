package com.example.lab5;

public class Food {
    private int id;
    private String name;
    private String decription;
    private double price;

    public Food(int id, String name, String decription, double price) {
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", decription='" + decription + '\'' +
                ", price=" + price +
                '}';
    }
}
