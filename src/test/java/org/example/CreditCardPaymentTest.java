package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardPaymentTest {
    @Test
    void shoudReturnSelfServiceMealValueWithCreditCardPayment() {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        SelfServiceMeal selfServiceMeal = new SelfServiceMeal(1000.0f);
        selfServiceMeal.setPaymentMethod(creditCardPayment);
        assertEquals(1250.0f, selfServiceMeal.calculateMealValue(), 0.01f);
    }

    @Test
    void shouldReturnALaCarteMealValueWithCreditCardCardPayment() {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        ALaCarteMeal aLaCarteMeal = new ALaCarteMeal(1200.0f);
        aLaCarteMeal.setPaymentMethod(creditCardPayment);
        assertEquals(1500.0f, aLaCarteMeal.calculateMealValue(), 0.01f);
    }

}
