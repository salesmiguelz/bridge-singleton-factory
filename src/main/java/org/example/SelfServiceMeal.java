package org.example;

public class SelfServiceMeal extends MealType {
    public SelfServiceMeal(float baseValue){
        super(baseValue);
    }

    public float calculateMealValue(){
        return this.basePrice * (1 + this.paymentMethod.priceIncrease());
    }
}
