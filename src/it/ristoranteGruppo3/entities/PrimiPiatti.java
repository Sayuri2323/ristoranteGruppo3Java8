package it.ristoranteGruppo3.entities;

/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimiPiatti extends Portata {
    public PrimiPiatti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.PRIMO);
    }

}

