package de.neuefische;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {
    private Map<Integer, Product> productMap = new HashMap<>();
    private static int runningShopProductID = 100;

    public ProductRepo(){
        System.out.println("empty ProductRepo was initialized");
        fillShopWithExampleProducts();
    }

    public void addProduct(Product product){
        productMap.put(runningShopProductID++, product);
    }

    public void removeProduct(Product product) {
        productMap.remove(product.productIDfromProducer());
    }

    public Product getProductByProductNumber(int productNumber){
        return productMap.get(productNumber);
    }

    public void printAllProducts(){
        productMap.forEach((k,v) -> System.out.println(k + " " + v));
    }

    public Map<Integer, Product> getProductMap(){
        return productMap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productMap, that.productMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productMap);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productMap=" + productMap +
                '}';
    }

    // HELPER METHODS
    private void fillShopWithExampleProducts(){
        // Products
        Product product1 = new Product(1, "Eggs", new BigDecimal("5"), 10);
        Product product2 = new Product(2, "Bacon", new BigDecimal("3"), 5);
        Product product3 = new Product(3, "Milk", new BigDecimal("12"), 12);
        Product product4 = new Product(4, "Apple", new BigDecimal("0.5"), 100);
        Product product5 = new Product(5, "Tomato", new BigDecimal("1.0"), 25);
        Product product6 = new Product(6, "Pasta", new BigDecimal("1.2"), 50);
        Product product7 = new Product(7, "T-Shirt", new BigDecimal("15.0"), 20);
        Product product8 = new Product(8, "Chocolate", new BigDecimal("3.5"), 12);
        Product product9 = new Product(9, "Bread", new BigDecimal("2.0"), 15);


        addProduct(product1);
        addProduct(product2);
        addProduct(product3);
        addProduct(product4);
        addProduct(product5);
        addProduct(product6);
        addProduct(product7);
        addProduct(product8);
        addProduct(product9);

        System.out.println("Example Products were added to ProductRepo");
    }
}
