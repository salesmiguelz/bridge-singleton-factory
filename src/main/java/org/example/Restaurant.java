package org.example;

import java.util.Date;

public class Restaurant {
    private Restaurant() {}
    private static Restaurant instance = new Restaurant();

    public static Restaurant getInstance() {
        return instance;
    }

    private String restaurantName;
    private Date restaurantFoundationDate;

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantFoundationDate(Date restaurantFoundationDate) {
        this.restaurantFoundationDate = restaurantFoundationDate;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Date getRestaurantFoundationDate() {
        return restaurantFoundationDate;
    }

}
