package it.ristoranteGruppo3.entities.dishes;
import it.ristoranteGruppo3.entities.enums.*;


/**
 * this class represents the firs courses in the menu
 *
 * @author Giulia Botto
 */

public class FirstCourse extends Dish {
    private FirstCourseTypeEnum firstType;
    private TypeOfBaking typeOfBaking;


    /**
     * Costruttore All args
     * @param dishName name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param firstType type of first course to use in FirstCourseTypeEnum
     * possible values SOUP,PASTA,RICE,OTHERS
     * @param description description of dish
     */
    public FirstCourse(String dishName, double dishPrice, TypeEnum typeEnum, FirstCourseTypeEnum firstType, TypeOfBaking typeOfBaking, String description) {
        super(dishName, dishPrice, typeEnum,description, DishTypeEnum.FIRST);
        this.firstType = firstType;
        this.typeOfBaking = typeOfBaking;
    }
    /**
     * this method print all parameters of the first course
     */
    @Override
    public void printDish(){
        System.out.println("-" + getDishName() + " " + String.format("%.2f", getDishPrice()) + "€");
        System.out.print(String.format("%s", getDescription()));
        System.out.println(" " + getFirstType().getTypeOfFirstCourse());
        System.out.print("this first course "+" "+ getTypeOfBaking().getBaking());
        System.out.println("\n");
    }
    public FirstCourseTypeEnum getFirstType() {
        return firstType;
    }

    public void setFirstType(FirstCourseTypeEnum firstType) {
        this.firstType = firstType;
    }
    public TypeOfBaking getTypeOfBaking() {
        return typeOfBaking;
    }

    public void setTypeOfBaking(TypeOfBaking typeOfBaking) {
        this.typeOfBaking = typeOfBaking;
    }

}


