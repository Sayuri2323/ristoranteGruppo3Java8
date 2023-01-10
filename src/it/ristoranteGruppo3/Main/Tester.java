import it.ristoranteGruppo3.entities.*;
import it.ristoranteGruppo3.entities.enums.*;
import it.ristoranteGruppo3.entities.portate.*;

public class Tester {
    public static void main(String[] args) {
        //creazione del nostro ristorante
        Ristorante ristoranteGruppo3 = new Ristorante("Ristorante Gruppo 3", "Privet Drive n.4", 23,"www.google.com","333333333333");
        Menu menuCarne = new Menu(TypeEnum.CARNE);
        Menu menuPesce = new Menu(TypeEnum.PESCE);
        Menu menuVegano = new Menu(TypeEnum.VEGANO);
        Menu menuVegetariano = new Menu(TypeEnum.VEGETARIANO);

        //aggiungiamo i menu al ristorante
        ristoranteGruppo3.setMenuRistorante(menuCarne);
        ristoranteGruppo3.setMenuRistorante(menuPesce);
        ristoranteGruppo3.setMenuRistorante(menuVegano);
        ristoranteGruppo3.setMenuRistorante(menuVegetariano);

        //creazione del menu carne che sara quello principale
        menuCarne.addPortata(new Antipasto("Tartare di manzo gourmet", 25, TypeEnum.CARNE,"con scamone di manzo, fava fresca e pecorino romano", TypeCotturaEnum.CRUDO));
        menuCarne.addPortata(new Antipasto("Mousse di mortadella", 13, TypeEnum.CARNE,"Mousse di mortadella con granella di pistacchi", TypeCotturaEnum.COTTO));
        menuCarne.addPortata(new Antipasto("Bignè salati ripieni", 8, TypeEnum.CARNE,"pasta choux, Grana Padano DOP e farcitura di formaggio", TypeCotturaEnum.FORNO));
        menuCarne.addPortata(new PrimoPiatto("Spaghetti alla carbonara", 18, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.COTTO,""));
        menuCarne.addPortata(new PrimoPiatto("Pappardelle al sugo di cinghiale", 16, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.FORNO,""));
        menuCarne.addPortata(new PrimoPiatto("Agnolotti con sugo di brasato", 22, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new PrimoPiatto("Ravioli alla bolognese", 16, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new PrimoPiatto("Tagliatelle al ragù di cervo", 22, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.COTTO,""));
        menuCarne.addPortata(new PrimoPiatto("Maltagliati al petto d'anatra", 25, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.COTTO,""));
        menuCarne.addPortata(new PrimoPiatto("Risotto zafferano e salsiccia", 18, TypeEnum.CARNE,TypePrimoEnum.PASTA,TypeCotturaEnum.COTTO,""));
        menuCarne.addPortata(new SecondoPiatto("Scaloppine al limone", 20, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new SecondoPiatto("Peperoni ripieni di carne e salsiccia", 18.50, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new SecondoPiatto("Spezzatino di maiale", 12.00, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new SecondoPiatto("Filetto di maiale con salsa al vino", 35, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new SecondoPiatto("Costoletta alla milanese", 10, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new SecondoPiatto("Braciole di maiale con crema di zucca e taleggio", 17, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO,""));
        menuCarne.addPortata(new Bevanda("Acqua minerale", 1.50, TypeEnum.CARNE,false,""));
        menuCarne.addPortata(new Bevanda("Acqua gassata", 1.50, TypeEnum.CARNE,false,""));
        menuCarne.addPortata(new Bevanda("Vino", 99.99, TypeEnum.CARNE,true,""));
        menuCarne.addPortata(new Bevanda("Pepsi", 2.50, TypeEnum.CARNE,false,""));
        menuCarne.addPortata(new Dessert("Zuppa inglese", 10, TypeEnum.CARNE,TypeCotturaEnum.BOLLITO, ""));
        menuCarne.addPortata(new Dessert("Tiramisu", 7, TypeEnum.CARNE, TypeCotturaEnum.SEMIFREDDO, ""));
        menuCarne.addPortata(new Dessert("torta di mandorle", 15, TypeEnum.CARNE,TypeCotturaEnum.SEMIFREDDO, ""));
        menuCarne.addPortata(new Dessert("Crostata di marmellata", 20, TypeEnum.CARNE,TypeCotturaEnum.SEMIFREDDO, ""));
        System.out.println("--------------------------------------------------");
    }
}
