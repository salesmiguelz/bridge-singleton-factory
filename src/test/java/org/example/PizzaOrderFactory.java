package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PizzaOrderFactory {
    @Test
    void shouldMakeFrenchFries() {
        IOrder order = OrderFactory.getOrder("Pizza");
        assertEquals("The pizza is ready!", order.make());
    }

    @Test
    void shouldCancelPizza() {
        IOrder order = OrderFactory.getOrder("Pizza");
        assertEquals("The pizza was canceled!", order.cancel());
    }
}
