package it.ristoranteGruppo3.entities.portate;
import it.ristoranteGruppo3.entities.enums.*;


/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimoPiatto extends Portata {
    private TypePrimoEnum tipologiaPrimo;

    /**
     * Costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param tipologiaPrimo tipologia di primo->  da utilizzare l'enum TypePrimoEnum
     * possibili valori MINESTRA,PASTA,RISO,ALTRO
     * @param descrizione descrizione della portata
     */
    public PrimoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum,TypePrimoEnum tipologiaPrimo,String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione);
        this.tipologiaPrimo = tipologiaPrimo;
    }

    /**
     * Metodo get che restituisce il valore di tipologiaPrimo
     * @return Ritorna il valore di tipologiaPrimo
     */
    public TypePrimoEnum getTipologiaPrimo() {
        return tipologiaPrimo;
    }

    /**
     * Metodo set che ci permette di cambiare o di impostare il valore di tipologiaPrimo
     * @param tipologiaPrimo
     */
    public void setTipologiaPrimo(TypePrimoEnum tipologiaPrimo) {
        this.tipologiaPrimo = tipologiaPrimo;
    }


    /**
     * Questo metodo ci permette di stampare tutti i parametri di un primo piatto
     */
    public void printPrimoPiatto(){
        this.printPortataGenerica();
        if (getTipologiaPrimo()!=null){
            System.out.print(" e' un primo piatto a base di"+" "+ tipologiaPrimo.name().toLowerCase());
            System.out.println("\n");
        }
    }
}


