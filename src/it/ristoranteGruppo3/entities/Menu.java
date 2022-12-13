package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    private TypeEnum typeOfMenu;
    private List<Portata> listaPortate;

    //TODO aggiungere altri field e metodi di stampa utilità, potete fare quello che volete
    public Menu(TypeEnum typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
        this.listaPortate = new ArrayList<>();
    }

    //TODO
    /**
     * Questo metodo Stampa l'intero menu' secondo l'ordine stabilito dall' EnumPortataType
     */
    public void printMenu() {
        for (Portata portata : listaPortate){
            portata.printPortata();
        }
    }

    public TypeEnum getTypeOfMenu() {
        return typeOfMenu;
    }

    public List<Portata> getListaPortate() {
        return listaPortate;
    }

    public void addPortata(Portata portata) {
        getListaPortate().add(portata);
    }
}

