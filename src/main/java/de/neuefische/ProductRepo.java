package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
}
