package de.neuefische;

public class ShopService {
    ProductRepo productRepo = new ProductRepo();
    OrderMapRepo orderMapRepo = new OrderMapRepo();

    public ShopService(ProductRepo productRepo, OrderMapRepo orderMapRepo) {
        this.productRepo = productRepo;
        this.orderMapRepo = orderMapRepo;
    }

    public void placeOrder(Order order){
        for(Product p : order.productListAsMap().values()){
            if(productRepo.getProductMap().get(p.productID()) == null){
                System.out.println(p + " wurde nicht gefunden");
            }
        }
        orderMapRepo.addOrder(order);
    }
}
