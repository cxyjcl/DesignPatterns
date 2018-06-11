package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class BuildFactoryPatternMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println(vegMeal.getCost());
        vegMeal.showItems();
    }
}
