package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.enums.TypeCotturaEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta i Dessert del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Dessert extends Portata {
    /**
     * Valore booleano che indica se il dessert contiene alcohol
     */
    private boolean alcolico;
    /**
     * Valore booleano che indica se il dissert è artigianale
     */
    private boolean artigianale;
    /**
     * Tipologia di cottura del dessert
     */
    private TypeCotturaEnum tipoCottura;

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

    public TypeCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TypeCotturaEnum tipoCottura) {
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
    public Dessert(String namePortata, double pricePortata, TypeEnum typeEnum,String descrizione, TypeCotturaEnum tipoCottura) {
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
     * Questo metodo stampa tutti i campi del dessert
     *TODO inserire @Override in tutte classi figlie
     */
    public void printDessert(){
        super.printPortataGenerica();
        if (getTipoCottura()!= null){
            System.out.print(" e' un dessert con tipologia di cottura"+" "+ tipoCottura.name().toLowerCase());
            System.out.print(" " + "contiene alcohol? " + isAlcolico() + " " + "e' artigianale? " + isArtigianale());
            System.out.println("\n");
        }
    }
}
