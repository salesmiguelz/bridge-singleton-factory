package org.example;

public class OrderFactory {
    public static IOrder getOrder(String order) {
        Class createdClass = null;
        Object createdObject = null;
        try {
            createdClass = Class.forName("org.example." + order + "Order" );
            createdObject = createdClass.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Inexistent order!");
        }
        if (!(createdObject instanceof IOrder)) {
            throw new IllegalArgumentException("Invalid order!");
        }
        return (IOrder) createdObject;
    }
}
