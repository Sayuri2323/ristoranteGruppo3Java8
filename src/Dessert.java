package src;
/**
 * Questa classe rappresenta i Dessert del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Dessert extends Portata implements IPortata {

    public Dessert(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.DESSERT);
    }
    @Override
    public void printPortata(){
        super.printPortata();
    }
}
