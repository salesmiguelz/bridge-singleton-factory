package org.example;

public class FrenchFriesOrder implements  IOrder{
    public String make(){
        return "The french fries are ready!";
    }

    public String cancel(){
        return "The french fries were canceled!";
    }
}
