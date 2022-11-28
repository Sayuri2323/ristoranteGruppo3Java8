import src.*;

public class Tester {

    public static void main(String[] args) {

        Menu menu=new Menu("Ristorante Gruppo 3", "Menu di carne");
        menu.listaPortate.add(new SecondiPiatti("Scaloppine al limone", 20));
        menu.listaPortate.add(new SecondiPiatti("Peperoni ripieni di carne e salsiccia", 18.50));
        menu.listaPortate.add(new SecondiPiatti("Arrosto di vitello al forno con patate", 25));
        menu.listaPortate.add(new SecondiPiatti("Spezzatino di maiale", 12.00));
        menu.listaPortate.add(new SecondiPiatti("Filetto di maiale con salsa al vino", 35));
        menu.listaPortate.add(new SecondiPiatti("Costoletta alla milanese", 10));
        menu.listaPortate.add(new SecondiPiatti("Braciole di maiale con crema di zucca e taleggio", 17));
        menu.listaPortate.add(new Bevande("Acqua minerale",1.50));
        menu.listaPortate.add(new Bevande("Acqua gassata",1.50));
        menu.listaPortate.add(new Bevande("Vino",99.99));
        menu.listaPortate.add(new Bevande("Pepsi",2.50));
        menu.listaPortate.add(new Dessert("Zuppa inglese",10));
        menu.listaPortate.add(new Dessert("Tiramisu",7));
        menu.listaPortate.add(new Dessert("torta di mandorle",15));
        menu.listaPortate.add(new Dessert("Crostata di marmellata",20));
        menu.printMenu();



    }
}
