package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String typeOfMenu;
    public List<Portata> listaPortate = new ArrayList<>();
    public Menu(String typeOfMenu) {
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

    /**
     * Questo metodo cicla il parametro List<IPortata> listaPortate e stampa solo le portate presenti di tipo
     * Type
     * @param type stabilisce quali portate vanno stampate.
     */
    private void stampaVoceMenu(EnumPortataType type) {
        listaPortate.stream().forEach(s -> {
            if (s.getTypePortata() == type) {
                s.printPortata();
            }
        });
    }
    public String getTypeOfMenu() {
        return typeOfMenu;
    }
}

