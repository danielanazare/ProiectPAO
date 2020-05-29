package model;

public class Meal extends TaskBase{
    public enum MealType{
        Breakfast,
        Lunch,
        Diner,
        Snack
    }
    private MealType mealType;

    public Meal(int id, String title, MealType mealType) {
        super(id, title);
        this.mealType = mealType;
    }

    public void setMealType(MealType mealType) {

        this.mealType = mealType;
    }

    public MealType getMealType() {

        return mealType;
    }
}

/*ca sa setez din afara setMealType(Meal.MealType.Lunch)*/
