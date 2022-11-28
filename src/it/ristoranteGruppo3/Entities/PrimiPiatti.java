package it.ristoranteGruppo3.Entities;

import it.ristoranteGruppo3.Interfaces.IPortata;

/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimiPiatti extends Portata implements IPortata {

    public static int counter = 0;//da implementarne l'utilizzo

    public PrimiPiatti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.PRIMO);
        counter ++;
    }
    @Override
    public void printPortata(){super.printPortata();
    }
}

