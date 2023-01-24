package it.ristoranteGruppo3.entities.dishes;
import it.ristoranteGruppo3.entities.enums.DishTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * this class represents the beverage in the menu
 * @author Raffaele Cuccaro
 */

public class Beverage extends Dish {
    private boolean alcohol;
    /**
     * costruttore All args
     * @param dishName Name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param description description of dish
     */

    public Beverage(String dishName, double dishPrice, TypeEnum typeEnum, boolean alcohol, String description) {
        super(dishName, dishPrice, typeEnum,description, DishTypeEnum.BEVERAGE);
        this.alcohol = alcohol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }
    @Override
    public void printDish(){
        System.out.println("-" + getDishName() + " " + String.format("%.2f", getDishPrice()) + "€");
        System.out.println(String.format("%s", getDescription()));
        if (isAlcohol()){
            System.out.print(" " + "this beverage is alcoholic");

        } else {
            System.out.print(" " + "this beverage is alcohol free");
        }
        System.out.println("\n");
    }
}
