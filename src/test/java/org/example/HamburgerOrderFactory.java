package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HamburgerOrderFactory {
    @Test
    void shouldMakeFrenchFries() {
        IOrder order = OrderFactory.getOrder("Hamburger");
        assertEquals("The hamburger is ready!", order.make());
    }

    @Test
    void shouldCancelHamburger() {
        IOrder order = OrderFactory.getOrder("Hamburger");
        assertEquals("The hamburger was canceled!", order.cancel());
    }
}
