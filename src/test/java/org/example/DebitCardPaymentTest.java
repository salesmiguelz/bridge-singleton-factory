package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardPaymentTest {
    @Test
    void shoudReturnSelfServiceMealValueWithDebitCardPayment() {
        DebitCardPayment debitCardPayment = new DebitCardPayment();
        SelfServiceMeal selfServiceMeal = new SelfServiceMeal(1000.0f);
        selfServiceMeal.setPaymentMethod(debitCardPayment);
        assertEquals(1500.0f, selfServiceMeal.calculateMealValue(), 0.01f);
    }

    @Test
    void shouldReturnALaCarteMealValueWithDebitCardCardPayment() {
        DebitCardPayment debitCardPayment = new DebitCardPayment();
        ALaCarteMeal aLaCarteMeal = new ALaCarteMeal(1200.0f);
        aLaCarteMeal.setPaymentMethod(debitCardPayment);
        assertEquals(1800.0f, aLaCarteMeal.calculateMealValue(), 0.01f);
    }

}
