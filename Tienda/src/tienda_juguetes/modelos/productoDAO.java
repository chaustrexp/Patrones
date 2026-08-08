package tienda_juguetes.modelos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class productoDAO {
    public Connection connex;
    public conexion_db objconex;
    
    public productoDAO() throws SQLException{
        this.objconex = new conexion_db();
    }
    
    public void consultarProducto() throws SQLException {
        String textoSql ="SELECT * FROM producto";
        Connection conexion = this.objconex.hacerConexion();
        PreparedStatement consultarSql = conexion.prepareStatement(textoSql);
        ResultSet resultado = consultarSql.executeQuery();
        //System.out.println("xxx: " + resultado);
        //System.out.println("xxx: " + resultado.next());
        
        while (resultado.next()) {
            String id = resultado.getString("codigo_id");
            String nombre = resultado.getString("nombre_producto");
            System.out.println("Codigo: " + id);
            System.out.println("nombre: " + nombre);
        }
        conexion.close();
    }
    
    public void guardarProducto(productoModelo objProdModelo) throws SQLException {
        Connection conexion = this.objConexion.hacerConexion();
        String textoSql = "INSERT INTO producto (codigo_id , nombre_producto)"
                + " VALUES (?, ?)" ;
        
        PreparedStatement consultaSql = conexion.prepareStatement(textoSql);
        //Asignacion a los signos?
        consultaSql.setString(1, objProdModelo.getIdProducto());
        consultaSql.setString(2, objProdModelo.getNombreProducto());
        consultaSql.executeUpdate();
    }


}
