package de.neuefische;

import java.util.List;

public class ShopService {
    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    public void placeOrder(Order order){
        for(Product p : order.productListAsMap().values()){
            if(productRepo.getProductMap().get(p.productID()) == null){
                System.out.println(p + " wurde nicht gefunden");
            }
        }
        orderRepo.addOrder(order);
    }
}
