package src;

/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimiPiatti extends Portata implements IPortata {

    public PrimiPiatti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.PRIMO);
    }
    @Override
    public void printPortata(){super.printPortata();
    }
}

