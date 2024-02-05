package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderMapRepo implements OrderRepo {
    private Map<Integer, Order> listOfOrdersMap = new HashMap<>();

    public Order getOrderByID(int orderID){
        return listOfOrdersMap.get(orderID);
    }
    @Override
    public void addOrder(Order order){
        listOfOrdersMap.put(order.orderID(), order);
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
