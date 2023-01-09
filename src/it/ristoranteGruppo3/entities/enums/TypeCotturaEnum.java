package it.ristoranteGruppo3.entities.enums;

public enum TypeCotturaEnum {

    FRITTO("viene servito fritto"),
    GRIGLIA("è cotto alla griglia"),
    FORNO("è fatto al forno"),
    VAPORE("è cotto al vapore"),
    CRUDO("viene servito crudo"),
    COTTO("viene servito cotto"),
    BOLLITO("viene servito bollito"),
    SEMIFREDDO("è semifreddo"),
    ;

    private String cottura;
    TypeCotturaEnum(String cottura) {
        this.cottura = cottura;
    }
    public String getCottura() {
        return cottura;
    }



}
