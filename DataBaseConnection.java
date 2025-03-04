package modelo.facturacion.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase encargada de gestionar la conexión a la base de datos.
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/clientes.productos";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    /**
     * Establece y devuelve una conexión a la base de datos.
     * @return Connection objeto de conexión.
     * @throws SQLException si hay un error en la conexión.
     */
    public static Connection getConnection() throws SQLException  {
        try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
