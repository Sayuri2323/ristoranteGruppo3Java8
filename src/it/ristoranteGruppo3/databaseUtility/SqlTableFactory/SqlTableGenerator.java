package it.ristoranteGruppo3.databaseUtility;

import java.sql.Connection;
import java.sql.SQLException;

public class SqlTableGenerator {
    private ISqlTable table;
    public ISqlTable createTable(Connection connection) throws SQLException {
        table.createTable(connection);
        return table;
    }
    public void setTable(ISqlTable table){
        this.table = table;
    }
}
