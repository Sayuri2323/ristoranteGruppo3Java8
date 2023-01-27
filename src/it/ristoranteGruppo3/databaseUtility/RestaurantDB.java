package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class RestaurantDB implements ISqlTable{

    private final String tableName = "restaurant";
    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable = connection.createStatement();){
            createTable.execute("CREATE TABLE IF NOT EXISTS " + tableName + "(\n" +
                    "  `id_restaurant` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `restaurantName` VARCHAR(64) NOT NULL,\n" +
                    "  `restaurantAddress` VARCHAR(128) NOT NULL,\n" +
                    "   max_capacity INT NOT NULL," +
                    "  `web_site` VARCHAR(45) NULL,\n" +
                    "  `phone_number` VARCHAR(10) NULL,\n" +
                    "  PRIMARY KEY (`id_restaurant`))");
        }
    }
    @Override
    public void describeTable(Connection connection) throws SQLException {
        ResultSet rs = null;
        ResultSetMetaData rsDesc = null;
        try(Statement describeTable = connection.createStatement();) {
            rs =describeTable.executeQuery("SELECT * FROM " + tableName);
            rsDesc = rs.getMetaData();
            System.out.printf("Client restaurant table has %d column\n",rsDesc.getColumnCount());
            System.out.println("Table description");
            for (int i = 1; i < rsDesc.getColumnCount(); i++) {
                System.out.println("Column number " + i + " is " + rsDesc.getColumnName(i) + " and the type of column is " + rsDesc.getColumnTypeName(i));
            }
        }
        rs.close();
        }
    }

