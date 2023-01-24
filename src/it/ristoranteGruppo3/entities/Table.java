package it.ristoranteGruppo3.entities;

public class Table {
        private int tableNumber;
        private Integer numberOfSeats;
        private Client client;


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

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void tableDetails(){
        System.out.println("Table number:"+" "+tableNumber);
        if (client != null) {
            System.out.println("The table is occupied by: "+client.getName());
            System.out.println("Number of customers at the table: "+tableNumber+": "+client.getNumberOfPeople());
        } else {System.out.println("table available");

        }
    }
}


