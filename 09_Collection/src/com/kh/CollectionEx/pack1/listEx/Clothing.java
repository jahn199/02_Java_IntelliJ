package com.kh.CollectionEx.pack1.listEx;

public class Clothing {
    private String name;
    private String categorty;
    private String price;

    public Clothing() {
    }

    public Clothing(String name, String categorty, String price) {
        this.name = name;
        this.categorty = categorty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorty() {
        return categorty;
    }

    public void setCategorty(String categorty) {
        this.categorty = categorty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "옷이름: " + name +
                ", 카테고리 : " + categorty +
                ", 옷가격 : " + price + "원";
    }
}
