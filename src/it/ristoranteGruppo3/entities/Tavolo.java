package it.ristoranteGruppo3.entities;

import java.util.ArrayList;
import java.util.List;

    public class Tavolo {
        private int numeroTavolo;
        private int numeroCoperti;// da vedere dove piazzare
        private double saldoTotale;//decidere se inserire qui o su Cliente
        private List<Portata> ordinazione=new ArrayList<>();//decidere se inserire qui o su Cliente
        private List<Cliente> listaClienti=new ArrayList<>();// da approvare
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
        public void prendiOrdine(Portata portata){       //è utile o migliorabile
            System.out.println(portata.getNamePortata()+" "+portata.getPricePortata()+" €");
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

        public int getNumeroCoperti() {
            return numeroCoperti;
        }

        public void setNumeroCoperti(int numeroCoperti) {
            this.numeroCoperti = numeroCoperti;
        }

        public double getSaldoTotale() {
            double x=0;
            for (Portata portata:ordinazione) {
                x=portata.getPricePortata()+x;
            }
           saldoTotale=x;
            return x;
        }


        public List<Portata> getOrdinazione() {
            return ordinazione;
        }

        public void addPortataOrdinazione(Portata ordinazione) {
            this.ordinazione.add(ordinazione);

        }
    }


