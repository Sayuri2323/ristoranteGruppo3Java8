package it.ristoranteGruppo3.entities.portate;
import it.ristoranteGruppo3.entities.enums.PortataTypeEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta le bevande del nostro menu'.
 * @author Raffaele Cuccaro
 */

public class Bevanda extends Portata {
    private boolean alcohol;
    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */

    public Bevanda(String namePortata, double pricePortata, TypeEnum typeEnum, boolean alcohol, String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione, PortataTypeEnum.BEVANDA);
        this.alcohol = alcohol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    /**
     * Questo metodo stampa tutti i campi della bevanda
     *
     * TODO refattorizzare con portata generica
     */

    @Override
    public void printPortata(){
        System.out.println("-" + getNamePortata() + " " + String.format("%.2f",getPricePortata()) + "€");
        System.out.println(String.format("%s", getDescrizione()));
        if (isAlcohol()){
            System.out.print(" " + "questa bevanda contiene alcohol");

        } else {
            System.out.print(" " + "questa bevanda non contiene alcohol");
        }
        System.out.println("\n");
    }
}
