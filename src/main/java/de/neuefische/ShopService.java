package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private static int runningOrderID = 100000;
    private ProductRepo productRepo;
    private OrderMapRepo orderMapRepo;

    public ShopService() {
        this.orderMapRepo = new OrderMapRepo();
        this.productRepo = new ProductRepo();
        System.out.println("Shop created");
    }

    public void placeOrder(List<Integer> productListToOrder){
        List<Product> newOrderAsProductList = new ArrayList<>();

        // check each product availability and add it to order
        for(Integer productID : productListToOrder){
            Product product = productRepo.getProductMap().get(productID);
            if(product == null){
                System.out.printf("Produkt mit der ID(%d) wurde nicht gefunden\n", productID);
                continue;
            }
            newOrderAsProductList.add(product);
        }
        orderMapRepo.addOrder(new Order(runningOrderID++, newOrderAsProductList));
    }

    public void showProductCatalogue(){
        productRepo.printAllProducts();
    }
}
