package it.ristoranteGruppo3.databaseUtility.dishDB;

import it.ristoranteGruppo3.databaseUtility.ISqlTable;

import java.sql.*;

public class FirstCourseDB implements ISqlTable {

    private final String tableName = "first_course";

    @Override
    public void createTable(Connection connection) throws SQLException {
        try (Statement createTable = connection.createStatement();) {
            createTable.execute("CREATE TABLE IF NOT EXISTS " + tableName + "(\n" +
                    "id_first_course INT NOT NULL AUTO_INCREMENT,\n" +
                    "dish_name VARCHAR(30) NOT NULL," +
                    "dish_price DOUBLE NOT NULL," +
                    "typeEnum ENUM(\"MEAT\",\"VEGAN\",\"VEGETARIAN\",\"FISH\")," +
                    "first_course_enum ENUM(\"PASTA\", \"RICE\", \"SOUP\", \"PIZZA\", \"GNOCCHI\") NOT NULL," +
                    "type_of_baking ENUM(\"FRIED\", \"GRILLED\", \"BAKED\", \"STEAMED\", \"RAW\", \"COOKED\", \"BOILED\", \"PARFAIT\") NOT NULL," +
                    "description VARCHAR(30) DEFAULT (\"\"),"+
                    "dishType VARCHAR (16) NOT NULL DEFAULT('First_course')," +
                    "id_menu INT NOT NULL," +
                    "PRIMARY KEY (id_first_course, id_menu)," +
                    "FOREIGN KEY (id_menu)" +
                    "REFERENCES menu (id_menu));");
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
