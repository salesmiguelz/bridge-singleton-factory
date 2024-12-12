package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OrderFactoryTest {
    @Test

    void shouldReturnInexistentOrderException(){
        try {
            IOrder order = OrderFactory.getOrder("Bread");
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Inexistent order!", e.getMessage());
        }
    }

    @Test

    void shouldReturnInvalidOrderException(){
        try {
            IOrder order = OrderFactory.getOrder("Water");
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Invalid order!", e.getMessage());
        }
    }
}
