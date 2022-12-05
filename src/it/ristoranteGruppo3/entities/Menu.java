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
        System.out.println("\n------------------------------" + typeOfMenu + "-----------------------------------\n");
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

