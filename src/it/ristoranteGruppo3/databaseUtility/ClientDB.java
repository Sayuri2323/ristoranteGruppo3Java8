package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class ClientDB implements ISqlTable{

    private final String tableName = "`client`";

    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable = connection.createStatement();){
            createTable.execute("CREATE TABLE " + tableName +
                    " (id_client INT AUTO_INCREMENT," +
                    " name VARCHAR (32) NOT NULL," +
                    " surname VARCHAR (32) NOT NULL," +
                    " typeEnum ENUM('MEAT','VEGAN','VEGETARIAN','FISH') NOT NULL," +
                    " has_payed BOOLEAN NOT NULL DEFAULT (FALSE)," +
                    " number_of_peaple INT NOT NULL DEFAULT (0)," +
                    " id_restaurant INT NOT NULL," +
                    " PRIMARY KEY(id_client,id_restaurant)," +
                    " FOREIGN KEY (id_restaurant) REFERENCES restaurant (id_restaurant));");
        }
    }

    @Override
    public void describeTable(Connection connection) throws SQLException {
        ResultSet rs = null;
        ResultSetMetaData rsDesc = null;
        try(Statement describeTable = connection.createStatement();) {
        rs =describeTable.executeQuery("SELECT * FROM " + tableName);
        rsDesc = rs.getMetaData();
            System.out.printf("Client table has %d column\n",rsDesc.getColumnCount());
            System.out.println("Client Table description");
            for (int i = 1; i < rsDesc.getColumnCount(); i++) {
                System.out.println("Column number " + i + " is " + rsDesc.getColumnName(i) + " and the type of column is " + rsDesc.getColumnTypeName(i));
            }
        }
        rs.close();
    }
}
