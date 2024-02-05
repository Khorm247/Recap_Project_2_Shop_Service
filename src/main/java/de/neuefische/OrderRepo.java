package de.neuefische;

public interface OrderRepo {

    void addOrder(Order order);
    void deleteOrder(Order order);
    void getSingle(int orderID);
    void getAll();
}
