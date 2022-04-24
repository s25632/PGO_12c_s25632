package cw3.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private int id;
    private static int idCounter = 0;
    public List<Products> products = new ArrayList<>();

    public ShoppingCart () {
        this.setId();
    }

    public final int getId() {
        return this.id;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public double totalPrice() {
        double sum = 0;
        if (this.products != null) {
            for (int i = 0; i < this.products.size(); i++) {
                sum += products.get(i).getPrice();
            }
        }
        return sum;
    }

    public int totalDelivery() {
        int deliveryTime = 0;
        if (this.products != null) {
            for (int i = 0; i < this.products.size(); i++) {
                if (this.products.get(i).getDeliveryTime() > deliveryTime) {
                    deliveryTime = this.products.get(i).getDeliveryTime();
                }
            }
        }
        return deliveryTime;
    }

    public void Sell() {
        if (this.products == null || this.products.isEmpty()) {
            throw new RuntimeException("Your cart is empty.");
        }
        for (Products product : this.products) {
            product.Sell();
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice() +
                ", totalDeliveryTime=" + totalDelivery() +
                '}';
    }
}

