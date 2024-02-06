package de.neuefische;

public class ShopService {
    ProductRepo productRepo;
    OrderMapRepo orderMapRepo;

    public ShopService() {
        this.orderMapRepo = new OrderMapRepo();
        this.productRepo = new ProductRepo();
        System.out.println("Shop created");
    }

    public void placeOrder(Order order){
        for(Product p : order.productListAsMap().values()){
            if(productRepo.getProductMap().get(p.productIDfromProducer()) == null){
                System.out.println(p + " wurde nicht gefunden");
            }
        }
        orderMapRepo.addOrder(order);
    }
}
