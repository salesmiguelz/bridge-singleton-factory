package org.example;

public class ALaCarteMeal extends MealType {
    public ALaCarteMeal(float baseValue){
        super(baseValue);
    }

    public float calculateMealValue(){
        return this.basePrice * (1 + this.paymentMethod.priceIncrease());
    }
}
