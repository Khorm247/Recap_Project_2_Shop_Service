package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderMapRepo implements OrderRepo {
    private Map<Integer, Order> listOfOrdersMap = new HashMap<>();

    // CONSTRUCTOR
    public OrderMapRepo(){
        System.out.println("empty OrderMapRepo was initialized");
    }

    // METHODS
    @Override
    public void addOrder(Order order){
        listOfOrdersMap.put(order.orderID(), order);
        System.out.printf("OrderNo %d received!", order.orderID());
        System.out.printf("Order includes a total of %d Products\n", order.productList().size());
    }
    @Override
    public void deleteOrder(Order order) {
        listOfOrdersMap.remove(order.orderID());
    }

    @Override
    public void getSingle(int orderID) {
        System.out.println(listOfOrdersMap.get(orderID));
    }

    @Override
    public void getAll() {
        listOfOrdersMap.forEach((k,v) -> System.out.println(k + " " + v));
    }

    public void clearOrderList(){
        listOfOrdersMap.clear();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderMapRepo that = (OrderMapRepo) o;
        return Objects.equals(listOfOrdersMap, that.listOfOrdersMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfOrdersMap);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "listOfOrdersMap=" + listOfOrdersMap +
                '}';
    }
}
