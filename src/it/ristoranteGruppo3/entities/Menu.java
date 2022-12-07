package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private TypeEnum typeOfMenu;
    public List<Portata> listaPortate = new ArrayList<>();
    public Menu(TypeEnum typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
    }

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
}

