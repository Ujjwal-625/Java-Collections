package com.bridgelabz.shopingcartsystem;

import java.util.*;

public class ShopingCart {
    // HashMap to store product prices (Product Name -> Price)
    private HashMap<String, Double> productPriceMap = new HashMap<>();

    // LinkedHashMap to maintain the order of items added (preserves insertion order)
    private LinkedHashMap<String, Product> cartOrderMap = new LinkedHashMap<>();

    // TreeMap to display items sorted by price (sorted by price)
    private TreeMap<Double, List<Product>> priceSortedMap = new TreeMap<>();

    // Method to add a product to the shopping cart
    public void addProductToCart(String name, double price) {
        Product product = new Product(name, price);

        // Add to productPriceMap
        productPriceMap.put(name, price);

        // Add to cartOrderMap to maintain the order of insertion
        cartOrderMap.put(name, product);

        // Add to priceSortedMap, grouping by price
        priceSortedMap.putIfAbsent(price, new ArrayList<>());
        priceSortedMap.get(price).add(product);
    }

    // Method to remove a product from the shopping cart by name
    public void removeProductFromCart(String name) {
        if (cartOrderMap.containsKey(name)) {
            Product product = cartOrderMap.remove(name);
            productPriceMap.remove(name);
            priceSortedMap.get(product.getPrice()).remove(product);

            // Remove the price entry from priceSortedMap if no products are left at that price
            if (priceSortedMap.get(product.getPrice()).isEmpty()) {
                priceSortedMap.remove(product.getPrice());
            }
        }
    }

    // Display the products in the order they were added (using LinkedHashMap)
    public void displayCartOrder() {
        System.out.println("Products in Order of Addition (LinkedHashMap):");
        cartOrderMap.values().forEach(System.out::println);
    }

    // Display products sorted by price (using TreeMap)
    public void displaySortedByPrice() {
        System.out.println("Products Sorted by Price (TreeMap):");
        priceSortedMap.forEach((price, products) -> {
            products.forEach(product -> System.out.println(product));
        });
    }

    // Display all product prices (using HashMap)
    public void displayAllPrices() {
        System.out.println("All Product Prices (HashMap):");
        productPriceMap.forEach((name, price) -> {
            System.out.println(name + " - $" + price);
        });
    }
}
