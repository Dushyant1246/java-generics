package com.bridgelabz.mealPlanGenerator;

public class MealUtility {
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        System.out.println("Generating meal plan: " + mealPlan.getMealType());
    }
}
