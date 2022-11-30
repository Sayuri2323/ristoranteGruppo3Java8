package it.ristoranteGruppo3.entities;


/**
 * Questa classe rappresenta le bevande del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Bevande extends Portata {

    public Bevande(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.BEVANDA);
    }
}
