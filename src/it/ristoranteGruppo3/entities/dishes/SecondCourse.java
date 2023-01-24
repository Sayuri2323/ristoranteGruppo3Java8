package it.ristoranteGruppo3.entities.dishes;

import it.ristoranteGruppo3.entities.enums.DishTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeOfBaking;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * this class represents second courses in the menu
 * @author Sepe Francesco
 */

public class SecondCourse extends Dish {
    private TypeOfBaking typeOfBaking;
    /**
     * constructor All args
     * @param dishName Name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param description description of dish
     */

    public SecondCourse(String dishName, double dishPrice, TypeEnum typeEnum, TypeOfBaking typeOfBaking, String description) {
        super(dishName, dishPrice, typeEnum,description, DishTypeEnum.SECOND);
        this.typeOfBaking = typeOfBaking;
    }

    private TypeOfBaking getTypeOfBaking() {
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
            System.out.print("This second course "+" "+ getTypeOfBaking().getBaking());
            System.out.println("\n");

        }
    }
}
