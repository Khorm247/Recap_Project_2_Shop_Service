package de.neuefische;

import java.util.Map;

public record Order(
        int orderID,
        Map<Integer, Product> productListAsMap
) {
}
