package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class MenuDB implements ISqlTable {
    private final String tableName = "menu";
    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable= connection.createStatement()){
            createTable.execute("CREATE TABLE menu("+
                    " menu_id INT PRIMARY KEY AUTO_INCREMENT,"+
                    " typeEnum ENUM(\"MEAT\",\"VEGAN\",\"VEGETARIAN\",\"FISH\"));");
        }
    }

    @Override
    public void describeTable(Connection connection) throws SQLException {
        ResultSet rs=null;
        ResultSetMetaData rsDesc=null;
        try(Statement describeTable= connection.createStatement()){
            rs=describeTable.executeQuery("SELECT * FROM " +tableName);
            rsDesc=rs.getMetaData();
            System.out.printf("Menù table has %d column\n",rsDesc.getColumnCount());
            System.out.println("Menù Table description");
            for (int i = 1; i < rsDesc.getColumnCount()+1; i++) {
                System.out.println("Column number " + i + " is " + rsDesc.getColumnName(i) + " and the type of column is " + rsDesc.getColumnTypeName(i));

            }
    }rs.close();
    }
}
