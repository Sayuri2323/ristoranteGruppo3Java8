package it.ristoranteGruppo3.entities;

public class Portata {

   private String namePortata;
   private double pricePortata;
   private TypeEnum typePortata;

   public Portata(String namePortata, double pricePortata,TypeEnum typeEnum) {
        this.namePortata = namePortata;
        this.pricePortata = pricePortata;
        this.typePortata = typePortata;

    }

    /**
     * Questo metodo stampa la portata nel seguente format nomePortata prezzoConDueDecimali€
     */
    public void printPortata(){
        System.out.println(namePortata + " " + String.format("%.2f",pricePortata) + "€");
    }

    public String getNamePortata() {
        return namePortata;
    }

    public double getPricePortata() {
        return pricePortata;
    }

    public EnumPortataType getTypePortata() {
        return typePortata;
    }


}