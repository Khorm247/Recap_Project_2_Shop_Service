package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product){
        productMap.put(product.productID(), product);
    }

    public void removeProduct(Product product) {
        productMap.remove(product.productID());
    }

    public Product getProductByProductNumber(int productNumber){
        return productMap.get(productNumber);
    }

    public Map<Integer, Product> getProductMap(){
        return productMap;
    }
}
