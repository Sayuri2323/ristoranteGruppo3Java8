package it.ristoranteGruppo3.databaseUtility;

public class SqlTableFactory {
    public static SqlTableGenerator createSqlTableGenerator(){
        SqlTableGenerator STG = new SqlTableGenerator();
        STG.setTable(new ClientDB());
        return STG;
    }
}
