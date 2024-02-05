package de.neuefische;

import java.util.*;

public class OrderListRepo implements OrderRepo {
    private List<Order> orderList = new ArrayList<>();

    public Order getOrderByID(int orderID){
        return orderList.get(orderID);
    }
    @Override
    public void addOrder(Order order){
        orderList.add(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderList.remove(order);
    }

    @Override
    public void getSingle(int orderID) {
        System.out.println(orderList.get(orderID));
    }

    @Override
    public void getAll() {
        orderList.forEach(System.out::println);
    }

    public void clearOrderList(){
        orderList.clear();
    }

    public List<Order> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderList, that.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "listOfOrdersMap=" + orderList +
                '}';
    }
}
