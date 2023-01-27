import it.ristoranteGruppo3.databaseUtility.ClientDB;
import it.ristoranteGruppo3.databaseUtility.DB;
import it.ristoranteGruppo3.databaseUtility.RestaurantDB;
import it.ristoranteGruppo3.entities.Client;
import it.ristoranteGruppo3.entities.Menu;
import it.ristoranteGruppo3.entities.Restaurant;
import it.ristoranteGruppo3.entities.enums.TypeEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
    public static void main(String[] args) throws SQLException {
    DB database = new DB("root", "password", "prova");
    ClientDB clientTable = new ClientDB();
    RestaurantDB restaurantDB = new RestaurantDB();
    database.createNewDB();
    Connection connection = database.getConnectionDB();
    clientTable.createTable(connection);
    restaurantDB.createTable(connection);
    clientTable.describeTable(connection);
    restaurantDB.describeTable(connection);
    }
}
