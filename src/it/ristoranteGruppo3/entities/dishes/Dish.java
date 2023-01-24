package it.ristoranteGruppo3.entities.dishes;

import it.ristoranteGruppo3.entities.enums.DishTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;


public class Dish {
   private String dishName;
    private double dishPrice;
    private TypeEnum type;
    private String description;
    private DishTypeEnum dishType;

    /**
     * constructor All args
     * @param dishName name of dish
     * @param dishPrice price of dish
     * @param typeEnum type of dish
     * @param description description of the dish
     */
    //TODO settare questo nuovo field
    public Dish(String dishName, double dishPrice, TypeEnum typeEnum, String description, DishTypeEnum dishType) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.type = typeEnum;
        this.description = description;
    }


    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public DishTypeEnum getDishType() {
        return dishType;
    }

    public void setDishType(DishTypeEnum dishType) {
        this.dishType = dishType;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum typeDish) {
        this.type = typeDish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method prints the dish
     */
    public void printDish(){
        System.out.println("-" + dishName + " " + String.format("%.2f", dishPrice) + "€");
            System.out.println(String.format("%s", getDescription()));

    }
}