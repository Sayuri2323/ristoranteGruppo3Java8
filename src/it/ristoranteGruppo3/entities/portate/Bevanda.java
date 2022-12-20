package it.ristoranteGruppo3.entities.portate;


import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta le bevande del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Bevanda extends Portata {
    private boolean hasAlcohol;
    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */

    public Bevanda(String namePortata, double pricePortata, TypeEnum typeEnum,boolean hasAlcohol,String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione);
        this.hasAlcohol = hasAlcohol;
    }

    /**
     * Costruttore per tutte le bevande senza descrizione o contenuto alcolico
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     */
    public Bevanda(String namePortata, double pricePortata, TypeEnum typeEnum) {
        super(namePortata, pricePortata, typeEnum);
        hasAlcohol = false;
    }
}
