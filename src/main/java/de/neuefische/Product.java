package de.neuefische;

import java.math.BigDecimal;

public record Product(
        int productIDfromProducer,
        String productName,
        BigDecimal productPrice,
        int unitsPerPackage
) {
    @Override
    public String toString() {
        return "Product{" +
                "productName= '" + productName + '\'' +
                ", productPrice= " + productPrice +
                ", unitsPerPackage= " + unitsPerPackage +
                ", productIdFromProducer= " + productIDfromProducer +
                " }";
    }
}
