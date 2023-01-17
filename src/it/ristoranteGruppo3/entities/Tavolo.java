package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.StatoTavoloEnum;

public class Tavolo {
        private int numeroTavolo;

        //TODO
        private Integer numeroPosti;


        //TODO togliamo riservato ed inseriamo un enumerato con più stati: libero, occupato, riservato
        public Tavolo(int numeroTavolo, Integer numeroPersone) {
            this.numeroTavolo = numeroTavolo;
        }
        public int getNumeroTavolo() {
            return numeroTavolo;
        }

        public void setNumeroTavolo(int numeroTavolo) {
            this.numeroTavolo = numeroTavolo;
        }


    public Integer getNumeroPosti() {
        return numeroPosti;
    }
}


