package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.enums.TipiCotturaEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta i Dessert del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Dessert extends Portata {
private boolean alcolico;
private boolean artigianale;
    TipiCotturaEnum tipoCottura;
    //TODO aggingere personalizzazioni


    public boolean isAlcolico() {
        return alcolico;
    }

    public void setAlcolico(boolean alcolico) {
        this.alcolico = alcolico;
    }

    public boolean isArtigianale() {
        return artigianale;
    }

    public void setArtigianale(boolean artigianale) {
        this.artigianale = artigianale;
    }

    public TipiCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TipiCotturaEnum tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     * @param tipoCottura tipo della cottura
     */
    public Dessert(String namePortata, double pricePortata, TypeEnum typeEnum,String descrizione, TipiCotturaEnum tipoCottura) {
        super(namePortata, pricePortata, typeEnum,descrizione);
        this.tipoCottura=tipoCottura;
    }

    /**
     * Costruttore per tutte le portate che non necessitano di una descrizione
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     */
    public Dessert(String namePortata, double pricePortata, TypeEnum typeEnum) {
        super(namePortata, pricePortata, typeEnum);
    }

    /**
     * Creato metodo di stampa solo Dessert
     * @param dessert
     */
    public void printDessert(Dessert dessert){
        System.out.println(dessert.getNamePortata()+" E' un prodotto artigianale? "+ artigianale +". E' alcolico? "+ alcolico +". Qual è il tipo di cottura? "+tipoCottura);
    }

}
