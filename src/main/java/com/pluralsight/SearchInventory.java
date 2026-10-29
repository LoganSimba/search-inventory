package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {

    public static void main(String[] args) {
        //creat arraylist to hold Priducts
        ArrayList<Product> products = new ArrayList<>();

        //call the getInventory method
        getInventory(products);

    }
    //added a method that adds inventory
    public static void getInventory(ArrayList<Product> products){
        products.add(new Product(123,"Gloves",9.99));
        products.add(new Product(124, "Hammer", 14.49));
        products.add(new Product(125, "Safety Goggles", 7.99));
        products.add(new Product(126, "Wrench Set", 19.95));
        products.add(new Product(127, "Work Boots", 49.99));
        products.add(new Product(128, "Toolbox", 24.50));

        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
