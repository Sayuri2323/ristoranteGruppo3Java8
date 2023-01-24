package it.ristoranteGruppo3.entities.enums;

public enum TypeEnum {

    MEAT("Meat"),
    FISH("Fish"),
    VEGAN("Vegan"),
    VEGETARIAN("Vegetarian");
private String typeEnum;
 TypeEnum(String typeEnum){
     this.typeEnum=typeEnum;
 }

    public String getTypeEnum() {
        return typeEnum;
    }
}
