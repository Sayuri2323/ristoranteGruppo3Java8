package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.TypeEnum;

/**
 * Questa classe rappresenta i secondi piatti del nostro menu'.
 * @author Sepe Francesco
 */

public class SecondoPiatto extends Portata {

    //TODO arricchiere


    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */
    public SecondoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum,String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione);

    }
    /**
     * Costruttore per tutte le portate che non necessitano di una descrizione
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     */
    public SecondoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum) {
        super(namePortata, pricePortata, typeEnum);
    }

}
