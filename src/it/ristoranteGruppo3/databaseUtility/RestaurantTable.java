package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class RestaurantTable implements ISqlTable{

    private final String tableName = "restaurant";
    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable = connection.createStatement();){
            createTable.execute("CREATE TABLE IF NOT EXISTS " + tableName + "(\n" +
                    "  `id_restaurant` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `restaurant_name` VARCHAR(64) NOT NULL,\n" +
                    "  `restaurant_Address` VARCHAR(128) NOT NULL,\n" +
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
    public void insertInto(Connection connection, String restaurant_name,String restaurant_Address,int max_capacity,String web_site, int phone_number) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO `test`.`restaurant` (`restaurant_name`, `restaurant_Address`, `max_capacity`, `web_site`, `phone_number`) VALUES ('"+ restaurant_name +"', '"+restaurant_Address + "', '"+ max_capacity +"', '"+web_site+"', '"+ phone_number +"');\n");
   }
    }

