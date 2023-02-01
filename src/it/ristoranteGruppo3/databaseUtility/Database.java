package it.ristoranteGruppo3.databaseUtility;
import it.ristoranteGruppo3.databaseUtility.dishDB.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Database instance = null;
    private String user;
    private String password;
    private String databaseName;
    private String url;

    /**
     * Costruttore Privato per la costruzione di un singleton in modo da poter limitare la creazione del Db ad una
     * singola Istanza
     * @param user Il nome dell'utente del database
     * @param password la passord dell'utente del database
     * @param databaseName il nome del database da creare
     */
    private Database(String user, String password, String databaseName,String url) {
        this.user = user;
        this.password = password;
        this.databaseName = databaseName;
        this.url = url + databaseName;
    }

    public static Database getInstance(String user, String password, String databaseName,String url) throws RuntimeException{
        if (instance != null){
           throw new RuntimeException("You cannot instance another DB!");
        }
        else {instance = new Database(user,password,databaseName,url);
        }
        return instance;
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

    /**
     * Questo metodo ci permette di connetterci al database dopo la sua creazione
     * @return il valore ritornato è la connessione al database
     * @throws SQLException
     */

    public Connection getConnectionDB() throws SQLException {
        Connection connection = DriverManager.getConnection(url,getUser(),password);
        return connection;
    }

    /**
     * Questo metodo crea da 0 il database, sulla porta localHost:3306, inoltre procede anche alla creazione
     * di tutte le table necessarie
     * @throws SQLException
     */
    public void createNewDB() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", getUser(), password);
             Statement stmt = con.createStatement();) {
            int status = stmt.executeUpdate("CREATE DATABASE  " + getDatabaseName());
            if (status > 0) {
                System.out.println("Database is created successfully !!!");
            } else {
                throw new SQLException("Error database cannot be created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Connection connection = this.getConnectionDB();
        //Si potrebbe rendere tutti i metodi di creazione table, statici in modo da non dover utilizzare le NEW?
        RestaurantTable restaurantTable = new RestaurantTable();
        ClientTable clientTable = new ClientTable();
        TableSqlTable tableSqlTable = new TableSqlTable();
        MenuTable menuTable = new MenuTable();
        AppetizersDB appetizersDB = new AppetizersDB();
        BeverageDB beverageDB = new BeverageDB();
        DessertDB dessertDB = new DessertDB();
        FirstCourseDB firstCourseDB = new FirstCourseDB();
        SecondCourseDB secondCourseDB = new SecondCourseDB();

        restaurantTable.createTable(connection);
        clientTable.createTable(connection);
        tableSqlTable.createTable(connection);
        menuTable.createTable(connection);
        appetizersDB.createTable(connection);
        beverageDB.createTable(connection);
        dessertDB.createTable(connection);
        firstCourseDB.createTable(connection);
        secondCourseDB.createTable(connection);

        connection.close();
    }




}



