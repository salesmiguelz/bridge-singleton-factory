package org.example;

public class PizzaOrder implements IOrder{
    public String make(){
        return "The pizza is ready!";
    }

    public String cancel(){
        return "The pizza was canceled!";
    }
}
