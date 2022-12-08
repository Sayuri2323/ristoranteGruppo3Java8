import it.ristoranteGruppo3.entities.*;

public class Tester {
    public static void main(String[] args) {
        Menu menu=new Menu(TypeEnum.CARNE);
        menu.addPortata(new Antipasto("Crostini con salame felino",8,TypeEnum.CARNE));
        menu.addPortata(new Antipasto("Tartare di manzo gourmet",25,TypeEnum.CARNE));
        menu.addPortata(new Antipasto("Mousse di mortadella",13,TypeEnum.CARNE));
        menu.addPortata(new Antipasto("Bignè salati ripieni",8,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Spaghetti alla carbonara", 18,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Pappardelle al sugo di cinghiale",16,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Agnolotti con sugo di brasato", 22,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Ravioli alla bolognese", 16,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Tagliatelle al ragù di cervo", 22,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Maltagliati al petto d'anatra", 25,TypeEnum.CARNE));
        menu.addPortata(new PrimoPiatto("Risotto zafferano e salsiccia", 18,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Scaloppine al limone", 20,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Peperoni ripieni di carne e salsiccia", 18.50,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Arrosto di vitello al forno con patate", 25,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Spezzatino di maiale", 12.00,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Filetto di maiale con salsa al vino", 35,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Costoletta alla milanese", 10,TypeEnum.CARNE));
        menu.addPortata(new SecondoPiatto("Braciole di maiale con crema di zucca e taleggio", 17,TypeEnum.CARNE));
        menu.addPortata(new Bevanda("Acqua minerale",1.50,TypeEnum.CARNE));
        menu.addPortata(new Bevanda("Acqua gassata",1.50,TypeEnum.CARNE));
        menu.addPortata(new Bevanda("Vino",99.99,TypeEnum.CARNE));
        menu.addPortata(new Bevanda("Pepsi",2.50,TypeEnum.CARNE));
        menu.addPortata(new Dessert("Zuppa inglese",10,TypeEnum.CARNE));
        menu.addPortata(new Dessert("Tiramisu",7,TypeEnum.CARNE));
        menu.addPortata(new Dessert("torta di mandorle",15,TypeEnum.CARNE));
        menu.addPortata(new Dessert("Crostata di marmellata",20,TypeEnum.CARNE));



        Menu menu1 = new Menu(TypeEnum.PESCE);
        menu1.addPortata(new Dessert("Crostata di marmellata",20,TypeEnum.PESCE));
        menu1.addPortata(new Dessert("PESCE AL BRODO",20,TypeEnum.PESCE));
        menu1.addPortata(new Dessert("PESCE FRITTO",20,TypeEnum.PESCE));
        menu1.addPortata(new Dessert("PESCE CRETINO",20,TypeEnum.PESCE));
        Ristorante ristoranteGruppo3=new Ristorante("Ristorante Gruppo 3","Privet Drive n.4",23);

        ristoranteGruppo3.menuRistorante.add(menu1);
        ristoranteGruppo3.menuRistorante.add(menu);
        ristoranteGruppo3.printAllMenu();





    }
}
