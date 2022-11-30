package it.ristoranteGruppo3.entities;

/**
 * Questa classe rappresenta i Dessert del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Dessert extends Portata {

    public Dessert(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.DESSERT);
    }
}
