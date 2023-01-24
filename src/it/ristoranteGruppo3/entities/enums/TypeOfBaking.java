package it.ristoranteGruppo3.entities.enums;

public enum TypeOfBaking {

    FRIED("served fried"),
    GRILLED("served grilled"),
    BAKED("is served baked in the oven"),
    STEAMED("is served steamed"),
    RAW("is served without any type of baking"),
    COOKED("served cooked"),
    BOILED("is boiled"),
    PARFAIT("is a parfait"),
    ;

    private String baking;
    TypeOfBaking(String baking) {
        this.baking = baking;
    }
    public String getBaking() {
        return baking;
    }



}
