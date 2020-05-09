package com.pizzadeliveryapp.models;

import java.util.Arrays;

public class Products {

    private char[] id = new char[4];
    private char[] categoryId = new char[3];
    private float price;
    private String product;
    private String taste;
    private String picture;

    public Products(char id[], String product, String taste, String picture, float price, char[] categoryId) {
        this.id = id;
        this.product = product;
        this.taste = taste;
        this.picture = picture;
        this.price = price;
        this.categoryId = categoryId;
    }

    public char[] getId() {
        return id;
    }

    public void setId(char[] id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public char[] getCategoryId() {
        return this.categoryId;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;

        return Arrays.equals(id, products.id);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(id);
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + Arrays.toString(id) +
                ", price=" + price +
                ", product='" + product + '\'' +
                ", taste='" + taste + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
