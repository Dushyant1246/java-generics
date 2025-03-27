package com.bridgelabz.onlineMarketplace;

public class ProductUtility {
    public static <T extends ProductCategory> void applyDiscount(Product<T> book, int i) {
        book.setPrice(book.getPrice() * i / 100);
    }
}
