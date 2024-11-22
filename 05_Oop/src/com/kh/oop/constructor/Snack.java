package com.kh.oop.constructor;

public class Snack {

    private String name;
    private int price;
    private String taste;

    public Snack() {

    }

    public Snack(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}