import it.ristoranteGruppo3.entities.Client;
import it.ristoranteGruppo3.entities.Menu;
import it.ristoranteGruppo3.entities.Restaurant;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

public class Start {
    public static void main(String[] args) {

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

        Client client = new Client("Tony","Tammaro", TypeEnum.FISH,10);
        Client client2 = new Client("aggagy","Tadgero", TypeEnum.FISH,6);
        restaurantGruppo3.reservation(client);


    }
}
