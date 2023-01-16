package it.ristoranteGruppo3.entities.portate;
import it.ristoranteGruppo3.entities.enums.*;


/**
 * Questa classe rappresenta i primi piatti del nostro menu'.
 *
 * @author Giulia Botto
 */

public class PrimoPiatto extends Portata {
    private TypePrimoEnum tipologiaPrimo;
    private TypeCotturaEnum typeCotturaEnum;


    /**
     * Costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param tipologiaPrimo tipologia di primo->  da utilizzare l'enum TypePrimoEnum
     * possibili valori MINESTRA,PASTA,RISO,ALTRO
     * @param descrizione descrizione della portata
     */
    public PrimoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum,TypePrimoEnum tipologiaPrimo,TypeCotturaEnum typeCotturaEnum,String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione, PortataTypeEnum.PRIMO);
        this.tipologiaPrimo = tipologiaPrimo;
        this.typeCotturaEnum = typeCotturaEnum;
    }
    /**
     * Questo metodo ci permette di stampare tutti i parametri di un primo piatto
     */
    @Override
    public void printPortata(){
        System.out.println("-" + getNamePortata() + " " + String.format("%.2f",getPricePortata()) + "€");
        System.out.print(String.format("%s", getDescrizione()));
        System.out.println(" " + getTipologiaPrimo().getTipoPrimo());
        System.out.print("Questo primo piatto"+" "+ getTipoCottura().getCottura());
        System.out.println("\n");
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
    public TypeCotturaEnum getTipoCottura() {
        return typeCotturaEnum;
    }

    public void setTypeCotturaEnum(TypeCotturaEnum typeCotturaEnum) {
        this.typeCotturaEnum = typeCotturaEnum;
    }

}


