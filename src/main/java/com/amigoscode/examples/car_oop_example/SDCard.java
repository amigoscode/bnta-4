package com.amigoscode.examples.car_oop_example;

import java.util.Objects;

public class SDCard {
    private String brand;
    private int storageSize;

    public SDCard(String brand, int storageSize) {
        this.brand = brand;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public String toString() {
        return "SDCard{" +
                "brand='" + brand + '\'' +
                ", storageSize=" + storageSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SDCard sdCard = (SDCard) o;
        return storageSize == sdCard.storageSize && Objects.equals(brand, sdCard.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, storageSize);
    }
}
