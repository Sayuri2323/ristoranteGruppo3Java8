package it.ristoranteGruppo3.Entities;

import it.ristoranteGruppo3.Interfaces.IPortata;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String resturantName;
    private String typeOfMenu;


    public List<IPortata> listaPortate = new ArrayList<>();

    public Menu(String resturantName, String typeOfMenu) {
        this.resturantName = resturantName;
        this.typeOfMenu = typeOfMenu;
    }

    public String getResturantName() {
        return resturantName;
    }

    public String getTypeOfMenu() {
        return typeOfMenu;
    }

    public void printMenu() {
        System.out.println("---------------------------" + resturantName + "--------------------------------\n");
        System.out.println("------------------------------" + typeOfMenu + "-----------------------------------\n");
        System.out.println("\n\n---------------------------------ANTIPASTI------------------------------------\n\n");
        stampaVoceMenu(EnumPortataType.ANTIPASTO);
        System.out.println("\n\n--------------------------------PRIMI PIATTI----------------------------------\n\n");
        stampaVoceMenu(EnumPortataType.PRIMO);
        System.out.println("\n\n-------------------------------SECONDI PIATTI---------------------------------\n\n");
        stampaVoceMenu(EnumPortataType.SECONDO);
        System.out.println("\n\n-----------------------------------BEVANDE------------------------------------\n\n");
        stampaVoceMenu(EnumPortataType.BEVANDA);
        System.out.println("\n\n-----------------------------------DESSERT-----------------------------------\n\n");
        stampaVoceMenu(EnumPortataType.DESSERT);

    }

    private void stampaVoceMenu(EnumPortataType type) {
        listaPortate.stream().forEach(s -> {
            if (s.getTypePortata() == type) {
                s.printPortata();
            }
        });
    }
}

