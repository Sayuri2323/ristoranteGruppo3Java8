package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

    public class Tavolo {
        private int numeroTavolo;

        //TODO il conto è sul ristorante
        private double conto;//decidere se inserire qui o su Cliente
        private List<Portata> ordinazione=new ArrayList<>();//decidere se inserire qui o su Cliente

        private boolean eRiservato;


        //TODO togliamo riservato ed inseriamo un enumerato con più stati: libero, occupato, riservato
        public Tavolo(int numeroTavolo, boolean eRiservato) {
            this.numeroTavolo = numeroTavolo;
            this.eRiservato = eRiservato;
        }

        //TODO per stampare i dettagli non si va l'override perchè il tostring è: nomeclasse@112332ù
        //ci da un identificativo stringato dell'oggetto, per stampare si fa un metodo void printDetailTable
        @Override
        public String toString() {
            return "Tavolo{" +
                    "numeroTavolo=" + numeroTavolo +
                    ", eRiservato=" + eRiservato +
                    '}';
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


        public boolean geteRiservato() {
            return eRiservato;
        }

        public void seteRiservato(boolean eRiservato) {
            this.eRiservato = eRiservato;
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


