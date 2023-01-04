package it.ristoranteGruppo3.entities.enums;

/**
 * Enumerazione che indica tutte le possibili tipologie di primo piatto
 */
public enum TypePrimoEnum {

        MINESTRA("E' una minestra"),
        PASTA("E' un piatto a base di pasta"),
        RISO("E' un piatto a base di riso"),
        GNOCCHI("E' un piatto a base di gnocchi"),
        PIZZA("E' una pizza"),
        ;
        private String tipoPrimo;
        TypePrimoEnum(String s) {
                this.tipoPrimo = s;
        }
        public String getTipoPrimo() {
                return tipoPrimo;
        }
}
