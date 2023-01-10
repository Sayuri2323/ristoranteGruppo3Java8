package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.enums.TypeCotturaEnum;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta i secondi piatti del nostro menu'.
 * @author Sepe Francesco
 */

public class SecondoPiatto extends Portata {
    private TypeCotturaEnum typeCotturaEnum;
    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */

    public SecondoPiatto(String namePortata, double pricePortata, TypeEnum typeEnum, TypeCotturaEnum typeCotturaEnum ,String descrizione) {
        super(namePortata, pricePortata, typeEnum,descrizione);
        this.typeCotturaEnum = typeCotturaEnum;
    }

    private TypeCotturaEnum getTipoCottura() {
        return typeCotturaEnum;
    }

    public void setTypeCotturaEnum(TypeCotturaEnum typeCotturaEnum) {
        this.typeCotturaEnum = typeCotturaEnum;
    }

    @Override
    public void printPortata(){
        System.out.println("-" + namePortata + " " + String.format("%.2f",pricePortata) + "€");
        System.out.println(String.format("%s", getDescrizione()));
        if (getTipoCottura()!= null){
            System.out.print("Questo secondo piatto"+" "+ getTipoCottura().getCottura());
            System.out.println("\n");

        }
    }
}
