package it.ristoranteGruppo3.Entities;

import it.ristoranteGruppo3.Interfaces.IPortata;

/**
 * Questa classe rappresenta i Dessert del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Dessert extends Portata implements IPortata {

    public Dessert(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.DESSERT);
    }

    //TODO sistemiamo la situazione delle'interfacce
    @Override
    public void printPortata(){
        super.printPortata();
    }
}
