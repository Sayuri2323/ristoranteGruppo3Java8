import it.ristoranteGruppo3.entities.*;

public class Tester {
    public static void main(String[] args) {
        Menu menu=new Menu("MENU' DI CARNE");
        menu.listaPortate.add(new Antipasto("Crostini con salame felino",8));
        menu.listaPortate.add(new Antipasto("Tartare di manzo gourmet",25));
        menu.listaPortate.add(new Antipasto("Mousse di mortadella",13));
        menu.listaPortate.add(new Antipasto("Bignè salati ripieni",8));
        menu.listaPortate.add(new PrimoPiatto("Spaghetti alla carbonara", 18));
        menu.listaPortate.add(new PrimoPiatto("Pappardelle al sugo di cinghiale",16));
        menu.listaPortate.add(new PrimoPiatto("Agnolotti con sugo di brasato", 22));
        menu.listaPortate.add(new PrimoPiatto("Ravioli alla bolognese", 16));
        menu.listaPortate.add(new PrimoPiatto("Tagliatelle al ragù di cervo", 22));
        menu.listaPortate.add(new PrimoPiatto("Maltagliati al petto d'anatra", 25));
        menu.listaPortate.add(new PrimoPiatto("Risotto zafferano e salsiccia", 18));
        menu.listaPortate.add(new SecondoPiatto("Scaloppine al limone", 20));
        menu.listaPortate.add(new SecondoPiatto("Peperoni ripieni di carne e salsiccia", 18.50));
        menu.listaPortate.add(new SecondoPiatto("Arrosto di vitello al forno con patate", 25));
        menu.listaPortate.add(new SecondoPiatto("Spezzatino di maiale", 12.00));
        menu.listaPortate.add(new SecondoPiatto("Filetto di maiale con salsa al vino", 35));
        menu.listaPortate.add(new SecondoPiatto("Costoletta alla milanese", 10));
        menu.listaPortate.add(new SecondoPiatto("Braciole di maiale con crema di zucca e taleggio", 17));
        menu.listaPortate.add(new Bevanda("Acqua minerale",1.50));
        menu.listaPortate.add(new Bevanda("Acqua gassata",1.50));
        menu.listaPortate.add(new Bevanda("Vino",99.99));
        menu.listaPortate.add(new Bevanda("Pepsi",2.50));
        menu.listaPortate.add(new Dessert("Zuppa inglese",10));
        menu.listaPortate.add(new Dessert("Tiramisu",7));
        menu.listaPortate.add(new Dessert("torta di mandorle",15));
        menu.listaPortate.add(new Dessert("Crostata di marmellata",20));



        Menu menu1 = new Menu("MENU' DI PESCE");
        menu1.listaPortate.add(new Dessert("Crostata di marmellata",20));
        Ristorante ristoranteGruppo3=new Ristorante("Ristorante Gruppi 3","Privet Drive n.4","Tradizionale",23);

        ristoranteGruppo3.menuRistorante.add(menu1);
        ristoranteGruppo3.menuRistorante.add(menu);
        ristoranteGruppo3.printAllMenu();





    }
}
