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

    public TypeCotturaEnum getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(TypeCotturaEnum tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    @Override
    public void printPortata(){
        System.out.println("-" + namePortata + " " + String.format("%.2f",pricePortata) + "€");
        System.out.println(String.format("%s", getDescrizione()));
        if (getTipoCottura()!= null){
            System.out.print("Questo antipasto"+" "+ getTipoCottura().getCottura());
            System.out.println("\n");
        }
    }
}
