package de.neuefische;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderListRepo {
    private Map<Integer, Order> listOfOrdersMap = new HashMap<>();

    public Order getOrderByID(int orderID){
        return listOfOrdersMap.get(orderID);
    }

    public void addOrder(Order order){
        listOfOrdersMap.put(order.orderID(), order);
    }

    public void printOrderList(){
        listOfOrdersMap.forEach((k,v) -> System.out.println(k + " " + v));
    }

    public Map<Integer, Order> getListOfOrdersMap() {
        return listOfOrdersMap;
    }
    public void setListOfOrdersMap(Map<Integer, Order> listOfOrdersMap) {
        this.listOfOrdersMap = listOfOrdersMap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
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
