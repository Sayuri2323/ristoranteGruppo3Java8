package it.ristoranteGruppo3.entities.portate;

import it.ristoranteGruppo3.entities.enums.TypeEnum;


public class Portata {
    private String namePortata;
    private double pricePortata;
    private TypeEnum typePortata;

    private String descrizione;

    /**
     * costruttore All args
     * @param namePortata Nome della portata
     * @param pricePortata prezzo della portata
     * @param typeEnum tipo della portata
     * @param descrizione descrizione della portata
     */
    public Portata(String namePortata, double pricePortata,TypeEnum typeEnum,String descrizione) {
        this.namePortata = namePortata;
        this.pricePortata = pricePortata;
        this.typePortata = typeEnum;
        this.descrizione = descrizione;
    }

    public String getNamePortata() {
        return namePortata;
    }

    public void setNamePortata(String namePortata) {
        this.namePortata = namePortata;
    }

    public double getPricePortata() {
        return pricePortata;
    }

    public void setPricePortata(double pricePortata) {
        this.pricePortata = pricePortata;
    }

    public TypeEnum getTypePortata() {
        return typePortata;
    }

    public void setTypePortata(TypeEnum typePortata) {
        this.typePortata = typePortata;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Questo metodo stampa la portata
     */
    public void printPortata(){
        System.out.println("-" + namePortata + " " + String.format("%.2f",pricePortata) + "€");
            System.out.println(String.format("%s", getDescrizione()));

    }
}