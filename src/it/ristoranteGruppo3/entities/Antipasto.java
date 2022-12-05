package it.ristoranteGruppo3.entities;


/**
 * Questa classe rappresenta gli antipasti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class Antipasto extends Portata {

    public Antipasto(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.ANTIPASTO);
    }

}
