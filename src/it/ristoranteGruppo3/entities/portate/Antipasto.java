package it.ristoranteGruppo3.entities.portate;
import it.ristoranteGruppo3.entities.enums.*;

/**
 * Questa classe rappresenta gli antipasti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class Antipasto extends Portata {

    private TypeCotturaEnum tipoCottura;


    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     * @param tipoCottura tipo della cottura
     */
    public Antipasto(String namePortata, double pricePortata, TypeEnum typeEnum, String descrizione, TypeCotturaEnum tipoCottura) {
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

    public TypeCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TypeCotturaEnum tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    /**
     * Questo metodo stampa tutti i campi dell'antipasto
     */
    public void printAntipasto(){
        super.printPortataGenerica();
        if (getTipoCottura()!=null){
            switch (getTipoCottura()){
                case FRITTO:
                    System.out.println("è un antipasto fritto");
                    break;
                case FORNO:
                    System.out.println("è un antipasto al forno");
                    break;
                case VAPORE:
                    System.out.println("è un antipasto al vapore");
                    break;
                case CRUDO:
                    System.out.println("è un antipasto crudo");
                    break;
                case COTTO:
                    System.out.println("è un antipasto cotto");
                    break;
                case BOLLITO:
                    System.out.println("è un antipasto bollito");
                    break;
                default:
                    System.out.println("Errore nel campo cottura");
                    break;
            }
            System.out.println("\n");
        }
    }

}
