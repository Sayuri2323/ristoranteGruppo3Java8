package it.ristoranteGruppo3.entities;

import it.ristoranteGruppo3.entities.portate.Portata;

import java.util.ArrayList;
import java.util.List;

    public class Tavolo {
        private int numeroTavolo;

        //TODO il conto è sul ristorante
        private double conto;//decidere se inserire qui o su Cliente
        private List<Portata> ordinazione=new ArrayList<>();//decidere se inserire qui o su Cliente

        StatoTavoloEnum statoDelTavolo;


        //TODO togliamo riservato ed inseriamo un enumerato con più stati: libero, occupato, riservato
        public Tavolo(int numeroTavolo, StatoTavoloEnum statoDelTavolo) {
            this.numeroTavolo = numeroTavolo;
            this.statoDelTavolo=statoDelTavolo;
        }

        public  void printTavoloDetails() {
            System.out.println("Il tavolo numero " +numeroTavolo+ " è "+ statoDelTavolo );
        }
        //il conto va bene void oppure vogliamo un return double?

        //TODO spostare questa logica
        public void getConto() {
            double x=0;
            System.out.print("Il conto è di ");
            for (Portata portata:ordinazione) {
                x=portata.getPricePortata()+x;
            }
            conto =x;
            System.out.println( String.format("%.2f",conto) + "€");
        }

        public void addPortataOrdinazione(Portata ordinazione) {
            this.ordinazione.add(ordinazione);

        }

        public void printOrdinazione(){
            System.out.println("Ordinazione del tavolo " + this.numeroTavolo);
            for (Portata p:this.ordinazione) {
                p.printPortata();
            }
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


        public List<Portata> getOrdinazione() {
            return ordinazione;
        }
    }


