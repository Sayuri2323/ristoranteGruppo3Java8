package it.ristoranteGruppo3.entities.dishes;
import it.ristoranteGruppo3.entities.enums.*;

/**
 * This class represents the appetizers in the menu
 *
 * @author Giulia Botto
 */

public class Appetizers extends Dish {

    private TypeOfBaking typeOfBaking;


    /**
     * constructor All args
     * @param dishName name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param description description of dish
     * @param typeOfBaking baking type of dish
     */
    public Appetizers(String dishName, double dishPrice, TypeEnum typeEnum, String description, TypeOfBaking typeOfBaking) {
        super(dishName, dishPrice, typeEnum,description, DishTypeEnum.APPETIZER);
        this.typeOfBaking = typeOfBaking;
    }

    public TypeOfBaking getTypeOfBaking() {
        return typeOfBaking;
    }

    public void setTypeOfBaking(TypeOfBaking typeOfBaking) {
        this.typeOfBaking = typeOfBaking;
    }

    @Override
    public void printDish(){
        System.out.println("-" + getDishName() + " " + String.format("%.2f", getDishPrice()) + "€");
        System.out.println(String.format("%s", getDescription()));
        if (getTypeOfBaking()!= null){
            System.out.print("this appetizer"+" "+ getTypeOfBaking().getBaking());
            System.out.println("\n");
        }
    }
}
