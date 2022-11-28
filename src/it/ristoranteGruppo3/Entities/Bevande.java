package it.ristoranteGruppo3.Entities;


import it.ristoranteGruppo3.Interfaces.IPortata;

/**
 * Questa classe rappresenta le bevande del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Bevande extends Portata implements IPortata {

    public Bevande(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.BEVANDA);
    }
    @Override
    public void printPortata(){
        super.printPortata();
    }
}
