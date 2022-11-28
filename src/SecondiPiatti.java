package src;

/**
 * Questa classe rappresenta i secondi piatti del nostro menu'.
 * @author Sepe Francesco
 */

public class SecondiPiatti extends Portata implements IPortata {

    public SecondiPiatti(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.SECONDO);
    }
    @Override
    public void printPortata(){
        super.printPortata();
    }
}
