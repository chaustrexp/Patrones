
package tienda_juguetes.controlador;

import tienda_juguetes.modelos.productoModelo;
import tienda_juguetes.modelos.ProductoDAO;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class controlador {

    public static void registrarProducto(String id, String nombre) {
        if (id.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos.");
            return;
        }

        productoModelo producto = new productoModelo(id, nombre);
        
        try {
            ProductoDAO dao = new ProductoDAO();
            dao.guardarProducto(producto);
            JOptionPane.showMessageDialog(null, "¡Producto guardado exitosamente!");
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar el producto: " + e.getMessage());
        }
    }

    public static void cargarProductosEnTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            ProductoDAO dao = new ProductoDAO();
            java.util.ArrayList<productoModelo> lista = dao.consultarProducto();
            for (productoModelo p : lista) {
                modelo.addRow(new Object[]{ p.getIdProducto(), p.getNombreProducto() });
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage());
        }
    }
}
