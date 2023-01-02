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

    public TypeCotturaEnum getTypeCotturaEnum() {
        return typeCotturaEnum;
    }

    public void setTypeCotturaEnum(TypeCotturaEnum typeCotturaEnum) {
        this.typeCotturaEnum = typeCotturaEnum;
    }
    public void printSecondoPiatto(){
        this.printPortataGenerica();
        if (getTypeCotturaEnum()!=null){
            switch (typeCotturaEnum){
                case FRITTO:
                    System.out.println("è un secondo fritto");
                    break;
                case FORNO:
                    System.out.println("è un secondo al forno");
                    break;
                case VAPORE:
                    System.out.println("è un secondo al vapore");
                    break;
                case CRUDO:
                    System.out.println("è un secondo crudo");
                    break;
                case COTTO:
                    System.out.println("è un secondo cotto");
                    break;
                case BOLLITO:
                    System.out.println("è un secondo bollito");
                    break;
                default:
                    System.out.println("Errore nel campo cottura");
                    break;
            }
            System.out.println("\n");
        }
    }
}
