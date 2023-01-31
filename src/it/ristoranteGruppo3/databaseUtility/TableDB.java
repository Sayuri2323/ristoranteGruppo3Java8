package it.ristoranteGruppo3.databaseUtility;

import java.sql.*;

public class TableDB implements  ISqlTable{

    private final String tableName = "`table`";

    @Override
    public void createTable(Connection connection) throws SQLException {
        try(Statement createTable = connection.createStatement();){
            createTable.execute("CREATE TABLE " + tableName +
                    " ( id_table INT AUTO_INCREMENT," +
                    "   number_of_seats INT NOT NULL," +
                    "   id_restaurant INT NOT NULL," +
                    "   PRIMARY KEY (id_table, id_restaurant)," +
                    "   FOREIGN KEY (id_restaurant)" +
                    "   REFERENCES restaurant (id_restaurant));");
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
