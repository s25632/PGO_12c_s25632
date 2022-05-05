package cw3.shop;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private int deliveryTime;
    private List<Products> storedProducts = new ArrayList<>();

    public Storage (int deliveryTime) {
        setDeliveryTime(deliveryTime);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime <= 0) {
            throw new RuntimeException("Delivery time must be higher than 0.");
        }
        this.deliveryTime = deliveryTime;
    }

    public List<Products> getStoredProducts() {
        return storedProducts;
    }

    public void setStoredProducts(Products product) {
        this.storedProducts.add(product);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "deliveryTime=" + deliveryTime +
                ", storedProducts=" + storedProducts +
                '}';
    }
}

