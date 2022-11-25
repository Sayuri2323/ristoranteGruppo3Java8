package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String resturantName;
    private String typeOfMenu;



    public List <IPortata> listaPortate = new ArrayList<>();

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
        printVociMenu();
    }

    public void printVociMenu(){
            System.out.println("\n\n---------------------------------ANTIPASTI------------------------------------\n\n");
            listaPortate.stream().forEach(s -> {
                if (s.getTypePortata() == EnumPortataType.ANTIPASTO) {
                    s.printPortata();
                }
            });
           System.out.println("\n\n--------------------------------PRIMI PIATTI----------------------------------\n\n");
           listaPortate.stream().forEach(s -> {
               if (s.getTypePortata() == EnumPortataType.PRIMO) {
                   s.printPortata();
               }
           });
           System.out.println("\n\n-------------------------------SECONDI PIATTI---------------------------------\n\n");
           listaPortate.stream().forEach(s -> {
               if (s.getTypePortata() == EnumPortataType.SECONDO) {
                   s.printPortata();
               }
           });
           System.out.println("\n\n-----------------------------------BEVANDE------------------------------------\n\n");
           listaPortate.stream().forEach(s -> {
               if (s.getTypePortata() == EnumPortataType.BEVANDA) {
                   s.printPortata();
               }
           });
           System.out.println("\n\n-----------------------------------DESSERT-----------------------------------\n\n");
           listaPortate.stream().forEach(s -> {
               if (s.getTypePortata() == EnumPortataType.DESSERT) {
                   s.printPortata();
               }
           });
       }
    }



