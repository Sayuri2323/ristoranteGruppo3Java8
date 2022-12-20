package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.enums.StatoTavoloEnum;

public class Tavolo {
        private int numeroTavolo;
        private StatoTavoloEnum statoDelTavolo;


        //TODO togliamo riservato ed inseriamo un enumerato con più stati: libero, occupato, riservato
        public Tavolo(int numeroTavolo, StatoTavoloEnum statoDelTavolo) {
            this.numeroTavolo = numeroTavolo;
            this.statoDelTavolo=statoDelTavolo;
        }

        public  void printTavoloDetails() {
            System.out.println("Il tavolo numero " +numeroTavolo+ " è "+ statoDelTavolo );
        }

        public StatoTavoloEnum getStatoDelTavolo() {
            return statoDelTavolo;
        }

        public void setStatoDelTavolo(StatoTavoloEnum statoDelTavolo ) {
            this.statoDelTavolo = statoDelTavolo;
        }

        public int getNumeroTavolo() {
            return numeroTavolo;
        }

        public void setNumeroTavolo(int numeroTavolo) {
            this.numeroTavolo = numeroTavolo;
        }

    }


