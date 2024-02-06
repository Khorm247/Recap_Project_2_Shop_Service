package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Wir eröffnen einen neuen Shop
        ShopService shopService = new ShopService();

        shopService.showProductCatalogue();

        List<Integer> clientOrder = new ArrayList<>();
        clientOrder.add(101);
        clientOrder.add(103);
        clientOrder.add(101);
        clientOrder.add(108);
        clientOrder.add(110);

        List<Integer> clientOrder2 = new ArrayList<>();
        clientOrder2.add(102);
        clientOrder2.add(104);
        clientOrder2.add(101);
        clientOrder2.add(100);
        clientOrder2.add(108);
        clientOrder2.add(110);
        clientOrder2.add(111);

        shopService.placeOrder(clientOrder);
        shopService.placeOrder(clientOrder2);
    }
}