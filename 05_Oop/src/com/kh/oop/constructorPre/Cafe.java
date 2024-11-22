package com.kh.oop.constructorPre;

public class Cafe {
    private String name;
    private int price;
    private int quantity;

    public Cafe(){

    }

    public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setMenu(String menu) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.quantity = quantity;
    }

    public String getMenu() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return quantity;
    }

    public int 주문총액(int price, int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                "price='"+ price + '\'' +
                "quantity='"+ quantity + '\'' +
                '}';
    }
}
