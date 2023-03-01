package configurations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigH2 {

    private static Connection connection;

    public ConfigH2() throws SQLException {
        connection = conexion();
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null)
            return conexion();
        return connection;
    }
    private static Connection conexion() throws SQLException {

        String url = "jdbc:h2:file:~/db/h2/testdb;" +
                "INIT=runscript from 'src/main/resources/sql/create.sql'\\;" +
                "runscript from 'src/main/resources/sql/init.sql'";

        String username = "sa";
        String password = "1234";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cerrarConexion() throws SQLException {
        conexion().close();
    }
}
