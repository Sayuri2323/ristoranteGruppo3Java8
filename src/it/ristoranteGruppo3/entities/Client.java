package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.TypeEnum;

/**
 * Questa classe rappresenta un cliente che frequentera' un determinato ristorante
 */
public class Client {
    /**
     * name of the client
     */
    private String name;
    /**
     * surname of the client
     */
    private String surname;
    /**
     * Type of menu of the client
     */
    private TypeEnum type;

    /**
     * boolean value to know if the client booked
     */
    private boolean hasBooked = false;

    /**
     * Boolean value to know if the client paid the bill
     */
    private boolean billPayed;


    private Integer numberOfPeople = 1;


    private Integer tableNumber;
    /**
     * Constructor of Client
     * @param name name of client
     * @param surname surname of client
     * @param type preferred menu type to client
     */
    public Client(String name, String surname, TypeEnum type, Integer numberOfPeople) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.numberOfPeople = numberOfPeople;
        this.billPayed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public boolean isHasBooked() {
        return hasBooked;
    }

    public void setHasBooked(boolean hasBooked) {
        this.hasBooked = hasBooked;
    }

    public boolean isBillPayed() {
        return billPayed;
    }

    public void setBillPayed(boolean billPayed) {
        this.billPayed = billPayed;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    /**
     * this method prints the values of the client in this format -> name+surname+typeEnum
     */
    public void printClient(){
        System.out.println(getSurname() + " " + getName() + " " + "Menu" + " " + getType());
    }

    //TODO
    public void payBill(){
        printBillInfo();
        setBillPayed(true);
    }

    private void printBillInfo() {
        System.out.print("the client" + " ");
        printClient();
        System.out.print(" "+"is paying the bill");
    }
}

