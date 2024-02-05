package de.neuefische;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        // Products
        Product product1 = new Product(1, "Eggs", new BigDecimal(5), 10);
        Product product2 = new Product(2, "Bacon", new BigDecimal(3), 5);
        Product product3 = new Product(3, "Milk", new BigDecimal(12), 12);

        shopService.productRepo.addProduct(product1);
        shopService.productRepo.addProduct(product2);
        shopService.productRepo.addProduct(product3);


        System.out.println(shopService.productRepo.getProductMap());
        shopService.productRepo.printAllProducts();

        Order order = new Order(321, null);
    }
}