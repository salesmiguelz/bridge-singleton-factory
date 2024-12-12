package org.example;

public class HamburgerOrder implements IOrder{
    public String make(){
        return "The hamburger is ready!";
    }

    public String cancel(){
        return "The hamburger was canceled!";
    }
}
