package com.pluralsight;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    // constructor for the Product class
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return productId + " | " + productName + " | $" + productPrice;
    }
}
