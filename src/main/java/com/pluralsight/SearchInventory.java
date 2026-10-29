package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SearchInventory {

    public static void main(String[] args) {
        //creat arraylist to hold Priducts
        ArrayList<Product> products = new ArrayList<>();

        //call the getInventory method
        getInventory(products);
        readFromCsv(products);
        System.out.println("-----------------");

        readFromCsv(products);

    }
    //added a method that adds inventory
    public static void getInventory(ArrayList<Product> products){
        products.add(new Product(123,"Gloves",9.99));
        products.add(new Product(124, "Hammer", 14.49));
        products.add(new Product(125, "Safety Goggles", 7.99));
        products.add(new Product(126, "Wrench Set", 19.95));
        products.add(new Product(127, "Work Boots", 49.99));
        products.add(new Product(128, "Toolbox", 24.50));

        //iterate through the products and print them in the desired format
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

    public static void readFromCsv(ArrayList<Product> products){
        //try catch block
        try {
            //initialize the bufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

            //initialize the line we will split after it reads the file
            String line;
            while((line = reader.readLine()) != null){
               String[] parts = line.split("\\|");
               //parse the line in index to add in our list
                int productId = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                //add the parsed lines to our Product arraylist
                products.add(new Product(productId, name , price));
            }

        }//catch the exception
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
