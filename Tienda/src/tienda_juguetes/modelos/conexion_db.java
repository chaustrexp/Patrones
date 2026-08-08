package tienda_juguetes.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_db {

    private String url;
    private String usuario;
    private String clave;
    private Connection conex;
    
    public conexion_db () throws SQLException {
        this.url = "jdbc:mysql://localhost:3307/tienda";
        this.usuario = "root";
        this.clave = "";
    }

    public Connection hacerConexion () throws SQLException {
        this.conex = DriverManager.getConnection(this.url, this.usuario, this.clave);
        System.out.println("conexion exitosa...");
        return conex;
    }

    public void cerrarConexion () throws SQLException {
        this.conex.close();
        System.out.println("conexion finalizada...");
    }

}
