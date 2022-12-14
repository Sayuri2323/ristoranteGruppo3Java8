import it.ristoranteGruppo3.entities.*;
import it.ristoranteGruppo3.entities.portate.*;

public class Tester {
    public static void main(String[] args) {
        //creazione del nostro ristorante
        Ristorante ristoranteGruppo3 = new Ristorante("Ristorante Gruppo 3", "Privet Drive n.4", 23);
        Menu menuCarne = new Menu(TypeEnum.CARNE);
        Menu menuPesce = new Menu(TypeEnum.PESCE);
        Menu menuVegano = new Menu(TypeEnum.VEGANO);
        Menu menuVegetariano = new Menu(TypeEnum.VEGETARIANO);

        //aggiungiamo i menu al ristorante
        ristoranteGruppo3.addMenuRistorante(menuCarne);
        ristoranteGruppo3.addMenuRistorante(menuPesce);
        ristoranteGruppo3.addMenuRistorante(menuVegano);
        ristoranteGruppo3.addMenuRistorante(menuVegetariano);

        //creazione del menu carne che sara quello principale
        menuCarne.addPortata(new Antipasto("Tartare di manzo gourmet", 25, TypeEnum.CARNE,"con scamone di manzo, fava fresca e pecorino romano"));
        menuCarne.addPortata(new Antipasto("Mousse di mortadella", 13, TypeEnum.CARNE,"Mousse di mortadella con granella di pistacchi"));
        menuCarne.addPortata(new Antipasto("Bignè salati ripieni", 8, TypeEnum.CARNE,"pasta choux, Grana Padano DOP e farcitura di formaggio"));
        menuCarne.addPortata(new PrimoPiatto("Spaghetti alla carbonara", 18, TypeEnum.CARNE,"con Guanciale,tuorli e pecorino romano"));
        menuCarne.addPortata(new PrimoPiatto("Pappardelle al sugo di cinghiale", 16, TypeEnum.CARNE));
        menuCarne.addPortata(new PrimoPiatto("Agnolotti con sugo di brasato", 22, TypeEnum.CARNE));
        menuCarne.addPortata(new PrimoPiatto("Ravioli alla bolognese", 16, TypeEnum.CARNE));
        menuCarne.addPortata(new PrimoPiatto("Tagliatelle al ragù di cervo", 22, TypeEnum.CARNE));
        menuCarne.addPortata(new PrimoPiatto("Maltagliati al petto d'anatra", 25, TypeEnum.CARNE));
        menuCarne.addPortata(new PrimoPiatto("Risotto zafferano e salsiccia", 18, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Scaloppine al limone", 20, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Peperoni ripieni di carne e salsiccia", 18.50, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Arrosto di vitello al forno con patate", 25, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Spezzatino di maiale", 12.00, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Filetto di maiale con salsa al vino", 35, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Costoletta alla milanese", 10, TypeEnum.CARNE));
        menuCarne.addPortata(new SecondoPiatto("Braciole di maiale con crema di zucca e taleggio", 17, TypeEnum.CARNE));
        menuCarne.addPortata(new Bevanda("Acqua minerale", 1.50, TypeEnum.CARNE));
        menuCarne.addPortata(new Bevanda("Acqua gassata", 1.50, TypeEnum.CARNE));
        menuCarne.addPortata(new Bevanda("Vino", 99.99, TypeEnum.CARNE));
        menuCarne.addPortata(new Bevanda("Pepsi", 2.50, TypeEnum.CARNE));
        menuCarne.addPortata(new Dessert("Zuppa inglese", 10, TypeEnum.CARNE));
        menuCarne.addPortata(new Dessert("Tiramisu", 7, TypeEnum.CARNE));
        menuCarne.addPortata(new Dessert("torta di mandorle", 15, TypeEnum.CARNE));
        menuCarne.addPortata(new Dessert("Crostata di marmellata", 20, TypeEnum.CARNE));

        //creazione del menu pesce
        menuPesce.addPortata(new Antipasto("Insalata di polipo", 36, TypeEnum.PESCE));
        menuPesce.addPortata(new Antipasto("Miste di spada, tonno, alici e baccalà", 20, TypeEnum.PESCE));
        menuPesce.addPortata(new PrimoPiatto("Ravioli ripieni ci capesante e crema alla zucca", 23, TypeEnum.PESCE));
        menuPesce.addPortata(new PrimoPiatto("Risotto al gambero rosso", 39, TypeEnum.PESCE));
        menuPesce.addPortata(new SecondoPiatto("Calamari alla brace", 20.50, TypeEnum.PESCE));
        menuPesce.addPortata(new SecondoPiatto("Fritto gamberi e calamari", 15, TypeEnum.PESCE));
        menuPesce.addPortata(new Bevanda("Acqua minerale", 1.50, TypeEnum.PESCE));
        menuPesce.addPortata(new Bevanda("Acqua gassata", 1.50, TypeEnum.PESCE));
        menuPesce.addPortata(new Bevanda("Vino", 99.99, TypeEnum.PESCE));
        menuPesce.addPortata(new Bevanda("Pepsi", 2.50, TypeEnum.PESCE));
        menuPesce.addPortata(new Dessert("Zuppa inglese", 10, TypeEnum.PESCE));
        menuPesce.addPortata(new Dessert("Tiramisu", 7, TypeEnum.PESCE));
        menuPesce.addPortata(new Dessert("torta di mandorle", 15, TypeEnum.PESCE));
        menuPesce.addPortata(new Dessert("Crostata di marmellata", 20, TypeEnum.PESCE));

        //creazione del menu vegano
        menuVegano.addPortata(new Antipasto("Hummus di edamame alla paprika", 112, TypeEnum.VEGANO));
        menuVegano.addPortata(new Antipasto("Tapenade di olive vegan", 29, TypeEnum.VEGANO));
        menuVegano.addPortata(new PrimoPiatto("Paccheri ripieni di peperoni", 26, TypeEnum.VEGANO));
        menuVegano.addPortata(new PrimoPiatto("Spacghetti con formaggio di anacardi", 43, TypeEnum.VEGANO));
        menuVegano.addPortata(new Bevanda("Acqua minerale", 1.50, TypeEnum.VEGANO));
        menuVegano.addPortata(new Bevanda("Acqua gassata", 1.50, TypeEnum.VEGANO));
        menuVegano.addPortata(new Bevanda("Vino", 99.99, TypeEnum.VEGANO));
        menuVegano.addPortata(new Bevanda("Pepsi", 2.50, TypeEnum.VEGANO));

        //creazione del menu vegetariano
        menuVegetariano.addPortata(new Antipasto("Hummus di edamame alla paprika", 112, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new Antipasto("Focaccia alla genovese", 17, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new PrimoPiatto("Pizzoccheri alla valtellinese", 45, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new PrimoPiatto("Spaghetti cacio e pepe", 19, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new Bevanda("Acqua minerale", 1.50, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new Bevanda("Acqua gassata", 1.50, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new Bevanda("Vino", 99.99, TypeEnum.VEGETARIANO));
        menuVegetariano.addPortata(new Bevanda("Pepsi", 2.50, TypeEnum.VEGETARIANO));
        ristoranteGruppo3.printAllMenu();
        //stampiamo tutti i menu

        System.out.println("--------------------------------------------------");

        //creazione tavolo
        Tavolo t1 = new Tavolo(2, StatoTavoloEnum.OCCUPATO);
        t1.printTavoloDetails();//va implementato un check della disponibilita del tavolo
        System.out.println("--------------------------------------------------");

        //creazione cliente
        Cliente c1 = new Cliente("Francesco", "Sepe", TypeEnum.CARNE);
        //assegnazione tavolo al cliente
        c1.setTavolo(t1);
        //creazione di un ordinazione
        c1.getOrdinazione(menuCarne.getListaPortate().get(4));
        c1.getOrdinazione(menuCarne.getListaPortate().get(1));
        c1.getOrdinazione(menuCarne.getListaPortate().get(6));
        c1.getOrdinazione(menuCarne.getListaPortate().get(10));
        //stampa dell'ordinazione
        t1.printOrdinazione();
        //stampa del conto
        t1.getConto();

        menuCarne.getListaPortate().get(2).setDescrizione("blablablablablabalbalbalblabl");







    }
}
