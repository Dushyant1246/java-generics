package com.bridgelabz.mealPlanGenerator;

public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMealPlan() {
        System.out.println("Your selected meal plan: " + mealPlan.getMealType());
    }
}