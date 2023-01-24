package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.dishes.Dish;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {


    private static int idTable = 0;
    /**
     * Name of restaurant
     */
    private String restaurantName;
    /**
     * Address of the restaurant
     */
    private String restaurantAddress;
    /**
     * Max capacity of clients in the restaurant
     */
    private int maxCapacity;

    /**
     * Reasonable capacity of clients in a single reservation
     */
    private int MaxNumber;

    /**
     * Website of restaurant
     */
    private final String webSite;

    /**
     * Telephone number of the restaurant
     */
    private String phoneNumber;
    /**
     * List of client in the restaurant
     */
    private List<Client> clients = new ArrayList<>();
    /**
     * List of tables in the restaurant
     */
    private List<Table> tables = new ArrayList<>();
    /**
     * List of menus in the restaurant
     */
    private List<Menu> menuResturant = new ArrayList<>();



    /**
     * Constructor of the restaurant
     *
     * @param name        Name of restaurant
     * @param address     Address of the restaurant
     * @param maxCapacity Max capacity of clients in the restaurant
     * @param webSite     Website of restaurant
     */
    public Restaurant(String name, String address, int maxCapacity,int MaxNumber, String webSite, String phoneNumber) {
        this.restaurantName = name;
        this.restaurantAddress = address;
        this.maxCapacity = maxCapacity;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
        this.MaxNumber = MaxNumber;
    }

    public List<Menu> getMenuResturant() {
        return menuResturant;
    }

    /**
     * This method inserts a menu in the menu list
     *
     * @param menu Menu to insert
     */
    public void setMenuResturant(Menu menu) {
        getMenuResturant().add(menu);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Client> getClients() {
        return clients;
    }

    /**
     * Questo metodo ci permette di inserire un nuovo cliente nella lista di clienti attualmente presenti nel ristorante
     * il cliente verra' aggiunto solo se il valore currentNumberOfClients non avra' superato maxCapacity del ristorante
     * @param client il cliente da aggiungere
     */
    public void reservation(Client client){
        if (maxCapacity != 0 && client.getNumberOfPeople() < MaxNumber ){
            Table table = new Table(idTable, client.getNumberOfPeople());
            idTable++;
            client.setTableNumber(idTable);
            maxCapacity--;
        }else if (client.getNumberOfPeople() >= MaxNumber ) {
            System.out.println("For private events please contact the restaurant number " + phoneNumber);
        }else {
            System.out.println("We are very sorry but the restaurant is fully booked ");
        }


    }



    public List<Table> getTables() {
        return tables;
    }

    public void setTavolo(Table table) {
       getTables().add(table);
    }

    public String getWebSite() {
        return webSite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * this method prints all menus in the restaurant
     */
    public void printAllMenu() {
        System.out.println("---------------------------" + this.restaurantName + "---------------------------\n");
        for (Menu menu : menuResturant) {
            System.out.println("------------------------" + "MENU " + menu.getTypeOfMenu() + "------------------------");
            menu.printMenu();
        }
    }
    /**
     * Questo metodo ci permette di calcolare il conto del cliente
     *
     * @param client Il cliente al quale bisogna calcolare il conto
     * @throws IllegalArgumentException in caso venga passato un cliente non valido
     */
    public void calculateBillClient(Client client, Menu menuFisso) throws IllegalArgumentException {
        if (getClients().contains(client)) {
            double bill = 0;
            for (Dish dish : menuFisso.getDishesList() ) {
                bill = bill + dish.getDishPrice();
            }
            System.out.println("The bill of the client is" +  " "  + String.format("%.2f",bill) + "€");
        } else {
            throw new IllegalArgumentException("Il cliente non è valido");
        }
        //TODO una volta pagato si elimina il cliente dalla lista
        removeClient(client);
    }
    /**
     * Questo metodo elimina il cliente dalla lista dei clienti presenti nel ristorante solo se ha pagato il conto
     * @param client il cliente da eliminare
     * @throws IllegalArgumentException
     */
    public void removeClient(Client client) throws IllegalArgumentException {

        //TODO bisogna recupare l'id del tavolo dal cliente o cambiare lo stato del tavolo.
        // vedere come usare il tutto


            if (getClients().contains(client)) {
                if (client.isBillPayed()) {
                    getClients().remove(client);
                } else System.out.println("The client still has to pay the bill");
            } else {
                throw new IllegalArgumentException("The client is not in the restaurant");
            }
    }
}
