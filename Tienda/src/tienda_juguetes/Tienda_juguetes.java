package tienda_juguetes;

import java.sql.SQLException;
import tienda_juguetes.modelos.conexion_db;

public class Tienda_juguetes {

    public static void main(String[] args) throws SQLException {
        // TODO: codigo logico de la aplicacion

        conexion_db objConex = new conexion_db();
        objConex.hacerConexion();
        objConex.cerrarConexion();
    }

}
