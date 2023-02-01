package it.ristoranteGruppo3.databaseUtility;

import java.sql.Connection;
import java.sql.SQLException;


public interface ISqlTable {
    void createTable(Connection connection) throws SQLException;
    void describeTable(Connection connection) throws SQLException;




}
