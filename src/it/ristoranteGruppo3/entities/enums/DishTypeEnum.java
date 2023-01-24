package it.ristoranteGruppo3.entities.enums;

public enum DishTypeEnum {

    APPETIZER("This is an appetizer"),
    FIRST("This is a first course"),
    SECOND("This is a second course"),
    DESSERT("This is a dessert"),
    BEVERAGE("This is a beverage");

    private String dishType;
    DishTypeEnum(String dishType){
        this.dishType = dishType;
    }
    public String getDishType(){
        return dishType;
    }
}
