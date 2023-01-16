package it.ristoranteGruppo3.entities.enums;

import it.ristoranteGruppo3.entities.portate.Portata;

public enum PortataTypeEnum {

    ANTIPASTO("Questo piatto è un antipasto"),
    PRIMO("Questo piatto è un primo"),
    SECONDO("Questo piatto è un secondo"),
    DESSERT("Questo piatto è un dessert"),
    BEVANDA("Questa è una bevanda");

    private String typePortata;
    PortataTypeEnum(String typePortata){
        this.typePortata=typePortata;
    }
    public String getTypePortata(){
        return  typePortata;
    }
}
