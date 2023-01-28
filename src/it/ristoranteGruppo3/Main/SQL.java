import it.ristoranteGruppo3.databaseUtility.*;
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
    DB database = new DB("root", "password1234", "prova");
    RestaurantDB resturantDB=new RestaurantDB();
    ClientDB clientDB=new ClientDB();
    MenuDB menuDB= new MenuDB();
    DishDB dishDB= new DishDB();
    database.createNewDB();
    Connection connection = database.getConnectionDB();
    resturantDB.createTable(connection);
    clientDB.createTable(connection);
    menuDB.createTable(connection);
    dishDB.createTable(connection);
    resturantDB.describeTable(connection);
    clientDB.describeTable(connection);
    menuDB.describeTable(connection);
    dishDB.describeTable(connection);

    }
}
