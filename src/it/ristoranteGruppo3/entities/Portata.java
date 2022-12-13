package it.ristoranteGruppo3.entities;

public class Portata {

    //TODO inserire la descrizione e pensare come differenziare i figli
    //mancaono i setter
   private String namePortata;
   private double pricePortata;
   private TypeEnum typePortata;

   //TODO bug!
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



}