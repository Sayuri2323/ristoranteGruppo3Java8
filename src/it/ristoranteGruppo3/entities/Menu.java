package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.DishTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;
import it.ristoranteGruppo3.entities.dishes.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    /**
     * type of menu
     */
    private TypeEnum typeOfMenu;
    /**
     * list of dishes in the menu
     */
    private List<Dish> dishList;

    /**
     * Costruttore del Menu
     * @param typeOfMenu Tipologia di Menu
     */
    public Menu(TypeEnum typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
        this.dishList = new ArrayList<>();
    }

    public TypeEnum getTypeOfMenu() {
        return typeOfMenu;
    }

    public List<Dish> getDishesList() {
        return dishList;
    }


    /**
     * This method is adding dishes in the menu
     * @param dish dish to add to the menu
     */
    public void addDish(Dish dish) {
        getDishesList().add(dish);
    }

    /**
     * this method prints the whole menu in the DishEnumType order
     */
    public void printMenu() {
        for (Dish dish : dishList){
            dish.printDish();
        }
    }

    /**
     * this method prints all the first course in the menu
     */

    //TODO sistamare
    public void firstCoursPrint(DishTypeEnum dishTypeEnum){
        System.out.println("First course   " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Dish genericDish : getDishesList()) {
            if (genericDish.getDishType() == dishTypeEnum){
                genericDish.printDish();
            }
        }
    }


}

