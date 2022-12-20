package it.ristoranteGruppo3.entities.portate;


import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta gli antipasti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class Antipasto extends Portata {

    TipiCotturaEnum tipoCottura;


    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     * @param tipoCottura tipo della cottura
     */
    public Antipasto(String namePortata, double pricePortata, TypeEnum typeEnum,String descrizione,TipiCotturaEnum tipoCottura) {
        super(namePortata, pricePortata, typeEnum,descrizione);
        this.tipoCottura=tipoCottura;
    }

    /**
     * Costruttore per tutte le portate che non necessitano di una descrizione
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     */
    public Antipasto(String namePortata, double pricePortata, TypeEnum typeEnum) {
        super(namePortata, pricePortata, typeEnum);
    }

}
