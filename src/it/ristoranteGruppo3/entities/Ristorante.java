package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private  String name;
    private String address;
    private int capienza;

    public List<Menu> menuRistorante=new ArrayList<>();


    public Ristorante(String name, String address, int capienza) {
        this.name = name;
        this.address = address;
        this.capienza=capienza;
    }


    public void printAllMenu(){
        System.out.println("---------------------------" + this.name + "---------------------------\n");
        for (Menu m: menuRistorante ) {
            System.out.println("------------------------" + "MENU " + m.getTypeOfMenu() + "------------------------");
            m.printMenu();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

}
