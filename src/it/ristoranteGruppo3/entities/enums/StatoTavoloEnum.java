package it.ristoranteGruppo3.entities.enums;

public enum StatoTavoloEnum {
    /**
     * TODO aggiungere descrizioni agli elementi enum
     */
    LIBERO("Il tavolo è libero"),
    OCCUPATO("Il tavolo è Occupato");

    private String StatoTavolo;
    StatoTavoloEnum (String s){
        this.StatoTavolo = s;
    }

}