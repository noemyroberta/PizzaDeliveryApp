package com.pizzadeliveryapp.models;

import java.util.Arrays;

public class Categories {

    private char[] id = new char[3];
    private String category;

    public Categories(char[] id, String category) {
        this.id = id;
        this.category = category;
    }

    public char[] getId() {
        return id;
    }

    public void setId(char[] id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categories that = (Categories) o;

        return Arrays.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(id);
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + Arrays.toString(id) +
                ", category='" + category + '\'' +
                '}';
    }
}
