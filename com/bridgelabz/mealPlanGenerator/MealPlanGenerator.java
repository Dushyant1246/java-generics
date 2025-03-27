package com.bridgelabz.mealPlanGenerator;

public class MealPlanGenerator{
    public static void main(String[] args) {
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        veganMeal.displayMealPlan();

        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        ketoMeal.displayMealPlan();

        Meal<HighProteinMeal> highProteinMealMeal = new Meal<>(new HighProteinMeal());
        highProteinMealMeal.displayMealPlan();

        MealUtility.generateMealPlan(new KetoMeal());
        MealUtility.generateMealPlan(new HighProteinMeal());
    }
}
/*
Your selected meal plan: Vegan Meal
Your selected meal plan: Keto Meal
Your selected meal plan: High-Protein Meal
Generating meal plan: Keto Meal
Generating meal plan: High-Protein Meal
 */