package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class DishDB implements ISqlTable{
    private final String tableName="dish";
    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable= connection.createStatement()){
            createTable.execute("CREATE TABLE dish("+
                    "dish_id INT PRIMARY KEY AUTO_INCREMENT,"+
                    "dish_name VARCHAR(30) NOT NULL,"+
                    "dish_price DOUBLE NOT NULL,"+
                    "typeEnum ENUM(\"MEAT\",\"VEGAN\",\"VEGETARIAN\",\"FISH\"),"+
                    "description VARCHAR(30),"+
                    "dishTypeEnum ENUM(\"APPETIZER\",\"FIRST\",\"SECOND\",\"DESSERT\",\"BEVERAGE\"));");
        }
        }


    @Override
    public void describeTable(Connection connection) throws SQLException {
        ResultSet rs = null;
        ResultSetMetaData rsDesc = null;
        try(Statement describeTable = connection.createStatement();) {
            rs =describeTable.executeQuery("SELECT * FROM " + tableName);
            rsDesc = rs.getMetaData();
            System.out.printf("Dish table has %d column\n",rsDesc.getColumnCount());
            System.out.println("Dish Table description");
            for (int i = 1; i < rsDesc.getColumnCount()+1; i++) {
                System.out.println("Column number " + i + " is " + rsDesc.getColumnName(i) + " and the type of column is " + rsDesc.getColumnTypeName(i));
            }rs.close();
        }

    }
}
