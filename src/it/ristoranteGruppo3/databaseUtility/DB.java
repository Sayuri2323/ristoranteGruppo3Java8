package it.ristoranteGruppo3.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    private String user;
    private String password;
    private String databaseName;

    public DB(String user, String password, String databaseName) {
        this.user = user;
        this.password = password;
        this.databaseName = databaseName;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Connection getConnectionDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/" + getDatabaseName();
        Connection connection = DriverManager.getConnection(url,getUser(),password);
        return connection;
    }

    public void createNewDB() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", getUser(), password);
             Statement stmt = con.createStatement();) {
            int status = stmt.executeUpdate("CREATE DATABASE " + getDatabaseName());
            if (status > 0) {
                System.out.println("Database is created successfully !!!");
            } else {
                throw new SQLException("\"Error database cannot be created\"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

