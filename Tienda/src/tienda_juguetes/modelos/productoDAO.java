package tienda_juguetes.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDAO {
    public Connection connex;
    public conexion_db objconex;
    
    public ProductoDAO() throws SQLException{
        this.objconex = new conexion_db();
    }
    
    public java.util.ArrayList<productoModelo> consultarProducto() throws SQLException {
        java.util.ArrayList<productoModelo> lista = new java.util.ArrayList<>();
        String textoSql ="SELECT * FROM producto";
        Connection conexion = this.objconex.hacerConexion();
        PreparedStatement consultarSql = conexion.prepareStatement(textoSql);
        ResultSet resultado = consultarSql.executeQuery();
        
        while (resultado.next()) {
            String id = resultado.getString("id_producto");
            String nombre = resultado.getString("id_nombre");
            lista.add(new productoModelo(id, nombre));
        }
        conexion.close();
        return lista;
    }
    
    public void guardarProducto(productoModelo objProdModelo) throws SQLException {
        Connection conexion = this.objconex.hacerConexion();
        String textoSql = "INSERT INTO producto (id_producto , id_nombre)"
                + " VALUES (?, ?)" ;
        
        PreparedStatement consultaSql = conexion.prepareStatement(textoSql);
        //Asignacion a los signos?
        consultaSql.setString(1, objProdModelo.getIdProducto());
        consultaSql.setString(2, objProdModelo.getNombreProducto());
        consultaSql.executeUpdate();
    }


}
