package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/testejava";
    private static final String user = "root";
    private static final String password = "Sccp#1221";

    private static Connection vin;

    public static Connection getconexao() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
