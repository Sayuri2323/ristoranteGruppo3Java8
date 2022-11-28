package src;

/**
 * Questa classe rappresenta gli antipasti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class Antipasti extends Portata implements IPortata {

    public Antipasti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.ANTIPASTO);
    }
    @Override
    public void printPortata(){super.printPortata();
    }
}
