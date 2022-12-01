package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private  String name;
    private String address;
    private String typeRistorante;

    private int capienza;

    public List<Menu> menuRistorante=new ArrayList<>();


    public Ristorante(String name, String address, String typeRistorante, int capienza) {
        this.name = name;
        this.address = address;
        this.typeRistorante = typeRistorante;
        this.capienza=capienza;
    }












    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeRistorante() {
        return typeRistorante;
    }

    public void setTypeRistorante(String typeRistorante) {
        this.typeRistorante = typeRistorante;
    }
}
