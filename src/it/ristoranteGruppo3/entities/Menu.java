package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.TypeEnum;
import it.ristoranteGruppo3.entities.portate.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    /**
     * Tipologia di menu
     */
    private TypeEnum typeOfMenu;
    /**
     * Lista di portate presenti all'interno del menu
     */
    private List<Portata> listaPortate;

    /**
     * Costruttore del Menu
     * @param typeOfMenu Tipologia di Menu
     */
    public Menu(TypeEnum typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
        this.listaPortate = new ArrayList<>();
    }

    public TypeEnum getTypeOfMenu() {
        return typeOfMenu;
    }

    public List<Portata> getListaPortate() {
        return listaPortate;
    }


    /**
     * Questo metodo ci permette di aggiungere una portata al menu
     * @param portata La portata da aggiungere al menu
     */
    public void addPortata(Portata portata) {
        getListaPortate().add(portata);
    }

    /**
     * Questo metodo Stampa l'intero menu' secondo l'ordine stabilito dall' EnumPortataType
     */
    public void printMenu() {
        for (Portata portata : listaPortate){
            portata.printPortataGenerica();
        }
    }

    /**
     * Questo metodo stampa tutti i primi piatti presenti all' interno del menu
     */
    public void printPrimiPiatti(){
        System.out.println("Stampa dei primi piatti del menu  " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Portata portataGenerica: getListaPortate()) {
            if (portataGenerica instanceof PrimoPiatto){
                ((PrimoPiatto) portataGenerica).printPrimoPiatto();
            }
        }
    }
    /**
     * Questo metodo stampa tutti gli Antipasti presenti all' interno del menu
     */
    public void printAntipasti(){
        System.out.println("Stampa degli antipasti del menu " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Portata portataGenerica: getListaPortate()) {
            if (portataGenerica instanceof Antipasto){
                ((Antipasto) portataGenerica).printAntipasto();
            }
        }
    }

    /**
     * Questo metodo stampa tutti i Dessert presenti all' interno del menu
     */
    public void printDessert(){
        System.out.println("Stampa dei Dessert del menu " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Portata portataGenerica: getListaPortate()) {
            if (portataGenerica instanceof Dessert){
                ((Dessert) portataGenerica).printDessert();
            }
        }
    }

    /**
     * Questo metodo stampa tutte le bevande presenti all' interno del menu
     */
    public void printBevanda(){
        System.out.println("Stampa delle Bevande del menu " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Portata portataGenerica: getListaPortate()) {
            if (portataGenerica instanceof Bevanda){
                ((Bevanda) portataGenerica).printBevanda();
            }
        }
    }
    public void printSecondi(){
        System.out.println("Stampa dei secondi del menu " + getTypeOfMenu().name().toLowerCase());
        System.out.println("\n");
        for (Portata portataGenerica: getListaPortate()) {
            if (portataGenerica instanceof SecondoPiatto){
                ((SecondoPiatto) portataGenerica).printSecondoPiatto();
            }
        }
    }

}

