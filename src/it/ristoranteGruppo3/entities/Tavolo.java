package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

    public class Tavolo {
        private int numeroTavolo;
        private double conto;//decidere se inserire qui o su Cliente
        private List<Portata> ordinazione=new ArrayList<>();//decidere se inserire qui o su Cliente

        private boolean eRiservato;

        public Tavolo(int numeroTavolo, boolean eRiservato) {
            this.numeroTavolo = numeroTavolo;
            this.eRiservato = eRiservato;
        }

        @Override
        public String toString() {
            return "Tavolo{" +
                    "numeroTavolo=" + numeroTavolo +
                    ", eRiservato=" + eRiservato +
                    '}';
        }
        //il conto va bene void oppure vogliamo un return double?
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


