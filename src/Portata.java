package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Portata implements IPortata {

   private String namePortata;
   private double pricePortata;

   private String typePortata;

    public Portata(String namePortata, double pricePortata,String typePortata) {
        this.namePortata = namePortata;
        this.pricePortata = pricePortata;
        this.typePortata = typePortata;
    }

    public String getNamePortata() {
        return namePortata;
    }

    public double getPricePortata() {
        return pricePortata;
    }

    @Override
    public String getTypePortata() {
        return typePortata;
    }

    void printPortata(){

        System.out.println(namePortata + " " + pricePortata);
    }


}