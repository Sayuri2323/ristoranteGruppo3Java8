package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.portate.Portata;

public class Cliente {

    //TODO risistemiamo concettualmente come sono organizzate le classi facendo attenzione a chi effettivamente ha il metodo
    private String name;
    private String surname;
    private TypeEnum type;
    private boolean hasBooked = false;

    private Tavolo tavolo;

    public Cliente(String name, String surname, TypeEnum type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void getOrdinazione(Portata portata) {
        tavolo.addPortataOrdinazione(portata);
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

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
            this.tavolo = tavolo;
    }
}
