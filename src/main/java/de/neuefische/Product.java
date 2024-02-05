package de.neuefische;

import java.math.BigDecimal;

public record Product(
        int productID,
        String productName,
        BigDecimal productPrice,
        int unitsPerPackage
) {
}
