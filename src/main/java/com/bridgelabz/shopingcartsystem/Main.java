package com.bridgelabz.shopingcartsystem;

public class Main {
    public static void main(String[] args) {
        // Create a new shopping cart
        ShopingCart cart = new ShopingCart();

        // Add products to the shopping cart
        cart.addProductToCart("Laptop", 999.99);
        cart.addProductToCart("Headphones", 199.99);
        cart.addProductToCart("Smartphone", 699.99);
        cart.addProductToCart("Keyboard", 49.99);
        cart.addProductToCart("Mouse", 25.99);
        cart.addProductToCart("Smartwatch", 199.99);

        // Display the products in the order they were added
        cart.displayCartOrder();

        // Display products sorted by price
        cart.displaySortedByPrice();

        // Display all product prices
        cart.displayAllPrices();

        // Remove a product from the cart
        cart.removeProductFromCart("Mouse");

        // Display the cart after removal
        System.out.println("\nAfter Removing 'Mouse':");
        cart.displayCartOrder();
        cart.displaySortedByPrice();
        cart.displayAllPrices();
    }
}

