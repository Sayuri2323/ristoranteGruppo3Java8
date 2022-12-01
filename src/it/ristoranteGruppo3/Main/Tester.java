import it.ristoranteGruppo3.entities.*;

public class Tester {
    public static void main(String[] args) {
        Menu menu=new Menu("RISTORANTE GRUPPO 3", "MENU' DI CARNE");
        menu.listaPortate.add(new Antipasti("Crostini con salame felino",8));
        menu.listaPortate.add(new Antipasti("Tartare di manzo gourmet",25));
        menu.listaPortate.add(new Antipasti("Mousse di mortadella",13));
        menu.listaPortate.add(new Antipasti("Bignè salati ripieni",8));
        menu.listaPortate.add(new PrimiPiatti("Spaghetti alla carbonara", 18));
        menu.listaPortate.add(new PrimiPiatti("Pappardelle al sugo di cinghiale",16));
        menu.listaPortate.add(new PrimiPiatti("Agnolotti con sugo di brasato", 22));
        menu.listaPortate.add(new PrimiPiatti("Ravioli alla bolognese", 16));
        menu.listaPortate.add(new PrimiPiatti("Tagliatelle al ragù di cervo", 22));
        menu.listaPortate.add(new PrimiPiatti("Maltagliati al petto d'anatra", 25));
        menu.listaPortate.add(new PrimiPiatti("Risotto zafferano e salsiccia", 18));
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

        Ristorante r=new Ristorante("Ristorante Gruppi 3","Privet Drive n.4","Tradizionale",23);
        r.menuRistorante.add(menu);
        r.menuRistorante.stream().forEach(s->{
            s.printMenu();
        });





    }
}
