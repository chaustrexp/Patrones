
package tienda_juguetes.modelos;


public class productoModelo {
    
    private String idProducto;
    private String nombreProudcto;
    
    public productoModelo(String datoId , String datoProducto) {
        this.idProducto = datoId;
        this.nombreProudcto = datoProducto;
    }
    
    public String getIdProducto () {
        return idProducto;
    }
    
    public String getNombreProducto() {
        return nombreProudcto;
    }
    
    
    public void setIdProducto (String idProducto) {
        this.idProducto = idProducto;
    }
    
    public void setNombreProducto (String nombreProducto) {
        this.nombreProudcto = nombreProducto;
    }
    
    public String verInfo() {
        String info = "id: "+this.idProducto +"  nombre: "+this.nombreProudcto;
        return info;
    }
}
