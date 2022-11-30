package it.ristoranteGruppo3.entities;


/**
 * Questa classe rappresenta gli antipasti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class Antipasti extends Portata {

    public Antipasti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.ANTIPASTO);
    }

}
