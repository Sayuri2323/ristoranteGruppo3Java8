package src;


public abstract class Portata implements IPortata {

   private String namePortata;
   private double pricePortata;

   private EnumPortataType typePortata;

    public Portata(String namePortata, double pricePortata,EnumPortataType typePortata) {
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
    public EnumPortataType getTypePortata() {
        return typePortata;
    }

    public void printPortata(){
        System.out.println(namePortata + " " + String.format("%.2f",pricePortata) + "€");
    }
}