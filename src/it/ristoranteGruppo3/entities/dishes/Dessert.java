package it.ristoranteGruppo3.entities.dishes;

import it.ristoranteGruppo3.entities.enums.DishTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeOfBaking;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * this class represents dessert in the menu
 * @author Raffaele Cuccaro
 */

public class Dessert extends Dish {
    private boolean alcohol;
    private boolean artisan;
    
    private TypeOfBaking typeOfBaking;

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isArtisan() {
        return artisan;
    }

    public void setArtisan(boolean artisan) {
        this.artisan = artisan;
    }

    public TypeOfBaking getTypeOfBaking() {
        return typeOfBaking;
    }

    public void setTypeOfBaking(TypeOfBaking typeOfBaking) {
        this.typeOfBaking = typeOfBaking;
    }

    /**
     * constructor All args
     * @param dishName name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param description description of dish
     * @param typeOfBaking type of baking
     *
     */
    public Dessert(String dishName, double dishPrice, TypeEnum typeEnum, TypeOfBaking typeOfBaking, String description) {
        super(dishName, dishPrice, typeEnum,description, DishTypeEnum.BEVERAGE);
        this.typeOfBaking = typeOfBaking;
    }
    @Override
    public void printDish(){
        System.out.println("-" + getDishName() + " " + String.format("%.2f", getDishPrice()) + "€");
        System.out.println(String.format("%s", getDescription()));
        if (getTypeOfBaking()!= null){
            System.out.print("the dessert"+" "+ getTypeOfBaking().getBaking());
            System.out.println("\n");
            System.out.print(" " + "contains alcohol? " + isAlcohol() + " " + "is artisan? " + isArtisan());
            System.out.println("\n");
        }
    }

}
