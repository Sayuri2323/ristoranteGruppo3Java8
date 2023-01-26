package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class ClientDB implements ISqlTable{

    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable = connection.createStatement();){
            createTable.execute("CREATE TABLE client(" +
                    " client_id INT PRIMARY KEY AUTO_INCREMENT," +
                    " name VARCHAR (20) NOT NULL," +
                    " surname VARCHAR (20) NOT NULL," +
                    " typeEnum ENUM(\"MEAT\",\"VEGAN\",\"VEGETARIAN\",\"FISH\")," +
                    " has_payed BOOLEAN NOT NULL DEFAULT (FALSE)," +
                    " number_of_peaple INT NOT NULL DEFAULT (0));");
        }
    }

    @Override
    public void describeTable(Connection connection) throws SQLException {
        ResultSet rs = null;
        ResultSetMetaData rsDesc = null;
        try(Statement describeTable = connection.createStatement();) {
        rs =describeTable.executeQuery("SELECT * FROM client");
        rsDesc = rs.getMetaData();
            System.out.printf("Client table has %d column\n",rsDesc.getColumnCount());
            System.out.println("Table description");
            for (int i = 1; i < rsDesc.getColumnCount(); i++) {
                System.out.println("Column number " + i + " is " + rsDesc.getColumnName(i) + " and the type of column is " + rsDesc.getColumnTypeName(i));
            }
        }
        rs.close();
    }

    @Override
    public void dropTable(Connection connection) throws SQLException {

    }


}
