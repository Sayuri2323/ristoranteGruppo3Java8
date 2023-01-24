import it.ristoranteGruppo3.entities.*;
import it.ristoranteGruppo3.entities.enums.*;
import it.ristoranteGruppo3.entities.dishes.*;

public class Tester {
    public static void main(String[] args) {
        //creazione del nostro ristorante
        Restaurant restaurantGruppo3 = new Restaurant("Ristorante Gruppo 3", "Privet Drive n.4", 1,17,"www.google.com","333333333333");
        Menu menuCarne = new Menu(TypeEnum.MEAT);
        Menu menuPesce = new Menu(TypeEnum.FISH);
        Menu menuVegano = new Menu(TypeEnum.VEGAN);
        Menu menuVegetariano = new Menu(TypeEnum.VEGETARIAN);

        //aggiungiamo i menu al ristorante
        restaurantGruppo3.setMenuResturant(menuCarne);
        restaurantGruppo3.setMenuResturant(menuPesce);
        restaurantGruppo3.setMenuResturant(menuVegano);
        restaurantGruppo3.setMenuResturant(menuVegetariano);

        //creazione del menu carne che sara quello principale
        menuCarne.addDish(new Appetizers("Tartare di manzo gourmet", 25, TypeEnum.MEAT,"con scamone di manzo, fava fresca e pecorino romano", TypeOfBaking.RAW));
        menuCarne.addDish(new Appetizers("Mousse di mortadella", 13, TypeEnum.MEAT,"Mousse di mortadella con granella di pistacchi", TypeOfBaking.COOKED));
        menuCarne.addDish(new Appetizers("Bignè salati ripieni", 8, TypeEnum.MEAT,"pasta choux, Grana Padano DOP e farcitura di formaggio", TypeOfBaking.BAKED));
        menuCarne.addDish(new FirstCourse("Spaghetti alla carbonara", 18, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.COOKED,""));
        menuCarne.addDish(new FirstCourse("Pappardelle al sugo di cinghiale", 16, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.BAKED,""));
        menuCarne.addDish(new FirstCourse("Agnolotti con sugo di brasato", 22, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new FirstCourse("Ravioli alla bolognese", 16, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new FirstCourse("Tagliatelle al ragù di cervo", 22, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.COOKED,""));
        menuCarne.addDish(new FirstCourse("Maltagliati al petto d'anatra", 25, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.COOKED,""));
        menuCarne.addDish(new FirstCourse("Risotto zafferano e salsiccia", 18, TypeEnum.MEAT, FirstCourseTypeEnum.PASTA, TypeOfBaking.COOKED,""));
        menuCarne.addDish(new SecondCourse("Scaloppine al limone", 20, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new SecondCourse("Peperoni ripieni di carne e salsiccia", 18.50, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new SecondCourse("Spezzatino di maiale", 12.00, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new SecondCourse("Filetto di maiale con salsa al vino", 35, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new SecondCourse("Costoletta alla milanese", 10, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new SecondCourse("Braciole di maiale con crema di zucca e taleggio", 17, TypeEnum.MEAT, TypeOfBaking.BOILED,""));
        menuCarne.addDish(new Beverage("Acqua minerale", 1.50, TypeEnum.MEAT,false,""));
        menuCarne.addDish(new Beverage("Acqua gassata", 1.50, TypeEnum.MEAT,false,""));
        menuCarne.addDish(new Beverage("Vino", 99.99, TypeEnum.MEAT,true,""));
        menuCarne.addDish(new Beverage("Pepsi", 2.50, TypeEnum.MEAT,false,""));
        menuCarne.addDish(new Dessert("Zuppa inglese", 10, TypeEnum.MEAT, TypeOfBaking.BOILED, ""));
        menuCarne.addDish(new Dessert("Tiramisu", 7, TypeEnum.MEAT, TypeOfBaking.PARFAIT, ""));
        menuCarne.addDish(new Dessert("torta di mandorle", 15, TypeEnum.MEAT, TypeOfBaking.PARFAIT, ""));
        menuCarne.addDish(new Dessert("Crostata di marmellata", 20, TypeEnum.MEAT, TypeOfBaking.PARFAIT, ""));
        System.out.println("--------------------------------------------------");
        Client client = new Client("Tony","Tammaro",TypeEnum.FISH,10);
    }
}
