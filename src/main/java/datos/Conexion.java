package datos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    //Metodo para conectarnos a la Base de Datos
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(JDBC_URL);

    }

    //Metodo para Cerrar Conexion
    public static void close(ResultSet rs) throws SQLException {

        rs.close();

    }
    //Metodo para Cerrar Conexion
    public static void close(PreparedStatement smtm) throws SQLException {

        smtm.close();

    }
    //Metodo para Cerrar Conexion
    public static void close(Connection conn) throws SQLException {

        conn.close();

    }

}
