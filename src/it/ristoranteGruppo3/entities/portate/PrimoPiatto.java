package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.TypeEnum;

/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimoPiatto extends Portata {

    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */
    public PrimoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum,String descrizione ) {
        super(namePortata, pricePortata, typeEnum,descrizione);

    }

    /**
     * Costruttore per tutte le portate che non necessitano di una descrizione
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     */
    public PrimoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum) {
        super(namePortata, pricePortata, typeEnum);
    }
}

