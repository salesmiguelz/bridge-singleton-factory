package org.example;

public abstract class MealType {
    protected PaymentMethod paymentMethod;

    protected float basePrice;

    public MealType(float basePrice){
        this.basePrice = basePrice;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public abstract float calculateMealValue();
}
