import it.ristoranteGruppo3.databaseUtility.*;


import java.sql.SQLException;

public class SQL {
    public static void main(String[] args) throws SQLException {
        DB database = DB.getInstance("root","password","ristorante_gruppo_3");
        database.createNewDB();
    }
}
