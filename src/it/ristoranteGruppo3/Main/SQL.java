import it.ristoranteGruppo3.databaseUtility.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
    public static void main(String[] args) throws SQLException {
        Database database = Database.getInstance("root", "J6q2rM62b11%B2D%CMzY", "ristorante_gruppo_3", "jdbc:mysql://localhost:3306/");
        Statement statement = database.getConnectionDB().createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM `restaurant`");
        while (rs.next()) {
            System.out.println(rs.getString("id_restaurant"));
        }
        rs.close();
        statement.close();
    }
}
