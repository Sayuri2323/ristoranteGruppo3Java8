package it.ristoranteGruppo3.entities;

public class Table {
        private int tableNumber;
        private Integer numberOfSeats;
        public Table(int TableNumber, Integer numberOfPeople) {
            this.tableNumber = TableNumber;
        }
        public int getTableNumber() {
            return tableNumber;
        }

        public void setTableNumber(int tableNumber) {
            this.tableNumber = tableNumber;
        }


    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }
}


