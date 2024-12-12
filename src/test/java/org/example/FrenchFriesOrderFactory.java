package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FrenchFriesOrderFactory {
    @Test
    void shouldMakeFrenchFries() {
        IOrder order = OrderFactory.getOrder("FrenchFries");
        assertEquals("The french fries are ready!", order.make());
    }

    @Test
    void shouldCancelFrenchFries() {
        IOrder order = OrderFactory.getOrder("FrenchFries");
        assertEquals("The french fries were canceled!", order.cancel());
    }
}
