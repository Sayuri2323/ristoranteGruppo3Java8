package it.ristoranteGruppo3.entities;

/**
 * Questa classe rappresenta i secondi piatti del nostro menu'.
 * @author Sepe Francesco
 */

public class SecondoPiatto extends Portata {

    public SecondoPiatto(String namePortata, double pricePortata) {
        super(namePortata, pricePortata, EnumPortataType.SECONDO);
    }

}
