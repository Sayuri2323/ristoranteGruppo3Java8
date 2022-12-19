package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    /**
     * Nome del ristorante
     */
    private String restaurantName;
    /**
     * Indirizzo del ristorante
     */
    private String restaurantAddress;
    /**
     * Capienza massima di clienti consentiti all'interno del ristorante
     */
    private int maxCapacity;
    /**
     * Numero di clienti attualmente presenti nel ristorante
     */
    private int currentNumberOfClients;
    /**
     * Sito web del ristorante
     */
    private final String webSite;

    /**
     * Numero di telefono del ristorante
     */
    private String phoneNumber;
    /**
     * Lista di clienti presenti nel ristorante
     */
    private List<Cliente> clienti = new ArrayList<>();
    /**
     * Lista di tavoli presenti nel ristorante
     */
    private List<Tavolo> tavoli = new ArrayList<>();
    /**
     * Lista di menu del ristorante
     */
    private List<Menu> menuRistorante = new ArrayList<>();

    /**
     * Costruttore del Ristorante
     *
     * @param name        Nome del ristorante
     * @param address     Indirizzo del ristorante
     * @param maxCapacity capienza clienti del ristorante
     * @param webSite     sito web del ristorante
     */
    public Ristorante(String name, String address, int maxCapacity, String webSite, String phoneNumber) {
        this.restaurantName = name;
        this.restaurantAddress = address;
        this.maxCapacity = maxCapacity;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
        this.currentNumberOfClients = 0;
    }

    public List<Menu> getMenuRistorante() {
        return menuRistorante;
    }

    /**
     * Questo metodo ci permette di inserire un menu alla lista dei menu del ristorante
     *
     * @param menu menu da inserire
     */
    public void setMenuRistorante(Menu menu) {
        getMenuRistorante().add(menu);
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

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(Cliente cliente) {
        if (currentNumberOfClients < maxCapacity) {
            getClienti().add(cliente);
            currentNumberOfClients++;
        } else System.out.println("Il ristorante è pieno, la preghiamo di attendere");
    }

    public List<Tavolo> getTavoli() {
        return tavoli;
    }

    public void setTavoli(List<Tavolo> tavoli) {
        this.tavoli = tavoli;
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
     * Questo metodo ci permette di stampare tutti i menu presenti nel ristorante
     */
    public void printAllMenu() {
        System.out.println("---------------------------" + this.restaurantName + "---------------------------\n");
        for (Menu menu : menuRistorante) {
            System.out.println("------------------------" + "MENU " + menu.getTypeOfMenu() + "------------------------");
            menu.printMenu();
        }
    }

    /**
     * Questo metodo ci permette di calcolare il conto del cliente
     *
     * @param cliente Il cliente al quale bisogna calcolare il conto
     * @throws IllegalArgumentException in caso venga passato un cliente non valido
     */
    public void calculateBillCliente(Cliente cliente) throws IllegalArgumentException {
        if (getClienti().contains(cliente)) {
            cliente.setbill(0);
        } else {
            throw new IllegalArgumentException("Il cliente non è valido");
        }
    }

    /**
     * Questo metodo elimina il cliente dalla lista dei clienti presenti nel ristorante solo se ha pagato il conto
     * @param cliente il cliente da eliminare
     * @throws IllegalArgumentException
     */
    public void removeCliente(Cliente cliente) throws IllegalArgumentException {
        if (getClienti().contains(cliente)) {
            if (cliente.isBillPayed()) {
                getClienti().remove(cliente);
                currentNumberOfClients--;
            } else System.out.println("Il cliente non ha ancora pagato il conto");
        } else {
            throw new IllegalArgumentException("Il cliente non è presente nel ristorante");
        }
    }
}
