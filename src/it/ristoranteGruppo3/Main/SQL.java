import it.ristoranteGruppo3.databaseUtility.*;
import it.ristoranteGruppo3.databaseUtility.SqlTableFactory.ClientDBInjection;
import it.ristoranteGruppo3.databaseUtility.SqlTableFactory.SqlTableGenerator;

import java.sql.SQLException;

public class SQL {
    public static void main(String[] args) throws SQLException {
        DB db = DB.getInstance("root","password","ristorante_gruppo_3");
    SqlTableGenerator gen  = ClientDBInjection.createSqlTableGenerator();
    gen.createTable(db.getConnectionDB());

    }
}
