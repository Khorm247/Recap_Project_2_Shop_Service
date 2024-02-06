package de.neuefische;

import java.util.List;

public record Order(
        int orderID,
        List<Product> productList
) {
}
