package com.bridgelabz.onlineMarketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new GadgetCategory());

        book.displayDetails();
        shirt.displayDetails();
        phone.displayDetails();

        System.out.println("\nApplying Discounts...");
        ProductUtility.applyDiscount(book, 10);  // 10% discount on book
        ProductUtility.applyDiscount(shirt, 20); // 20% discount on shirt
        ProductUtility.applyDiscount(phone, 5);  // 5% discount on phone

        System.out.println("\nUpdated Prices:");
        book.displayDetails();
        shirt.displayDetails();
        phone.displayDetails();

    }
}
/*
Java Programming (Books) - $50.0
T-Shirt (Clothing) - $20.0
Smartphone (Gadgets) - $500.0

Applying Discounts...

Updated Prices:
Java Programming (Books) - $5.0
T-Shirt (Clothing) - $4.0
Smartphone (Gadgets) - $25.0
 */