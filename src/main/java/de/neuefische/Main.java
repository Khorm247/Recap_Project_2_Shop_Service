package de.neuefische;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Wir eröffnen einen neuen Shop
        ShopService shopService = new ShopService();

        //System.out.println(shopService.productRepo.getProductMap());
        shopService.productRepo.printAllProducts();

        Order order = new Order(321, null);
    }
}