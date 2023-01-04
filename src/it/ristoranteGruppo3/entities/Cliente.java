package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.TypeEnum;
import it.ristoranteGruppo3.entities.portate.Portata;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe rappresenta un cliente che frequentera' un determinato ristorante
 */
public class Cliente {
    /**
     * Nome del cliente
     */
    private String name;
    /**
     * Cognome del cliente
     */
    private String surname;
    /**
     * Tipologia Menu preferita dal Cliente
     */
    private TypeEnum type;

    /**
     * Valore booleano che tiene traccia dei clienti che abbiano una prenotazione
     */
    private boolean hasBooked = false;

    /**
     * Valore booleano che tiene traccia dell avvenuto pagamento del cliente
     */
    private boolean billPayed;

    /**
     * Costruttore del cliente
     * @param name Rappresenta il nome del cliente
     * @param surname Rappresenta cognome del cliente
     * @param type Rappresenta la tipollogia di menu preferita dal cliente
     */
    public Cliente(String name, String surname, TypeEnum type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
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

    /**
     * Questo metodo stampa i valori del cliente nel seguente formato -> nome+cognome+typeEnum
     */
    public void printCliente(){
        System.out.println(getSurname() + " " + getName() + " " + "Tipologia" + " " + getType());
    }
    public void payBill(){
        System.out.print("Il cliente" + " ");
        this.printCliente();
        System.out.print(" "+"Sta pagando il conto");
        setBillPayed(true);
    }
}

