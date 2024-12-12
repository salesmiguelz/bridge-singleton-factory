package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    public void shouldReturnResturantName(){
        Restaurant.getInstance().setRestaurantName("Miguel's Pizza");
        assertEquals("Miguel's Pizza", Restaurant.getInstance().getRestaurantName());
    }

    @Test
    public void shouldReturnFoundationDate(){
        Restaurant.getInstance().setRestaurantName("12/12/24");
        assertEquals("12/12/24", Restaurant.getInstance().getRestaurantName());
    }


}