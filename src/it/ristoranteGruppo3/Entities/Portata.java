package it.ristoranteGruppo3.Entities;

import it.ristoranteGruppo3.Interfaces.IPortata;

public abstract class Portata implements IPortata {

   private String namePortata;
   private double pricePortata;
   private EnumPortataType typePortata;

   //TODO se una classe è asbtract a che serve
   public Portata(String namePortata, double pricePortata,EnumPortataType typePortata) {
        this.namePortata = namePortata;
        this.pricePortata = pricePortata;
        this.typePortata = typePortata;
    }

    //TODO regole di cleaning code?! prima i metodi in override
    public String getNamePortata() {
        return namePortata;
    }

    public double getPricePortata() {
        return pricePortata;
    }


    @Override
    public EnumPortataType getTypePortata() {
        return typePortata;
    }

    /**
     * Questo metodo stampa la portata nel seguente format nomePortata prezzoConDueDecimali€
     */
    public void printPortata(){
        System.out.println(namePortata + " " + String.format("%.2f",pricePortata) + "€");
    }
}