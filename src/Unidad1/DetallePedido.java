
package Unidad1;

/**
 *
 * @author Aldave
 */
public class DetallePedido {
 private Producto producto;
 private int cantidad;
 private double precioUnitario;
 
public DetallePedido(Producto producto,int cantidad, double precioUnitario ){
this.producto = producto;
this.precioUnitario = precioUnitario;
this.cantidad = cantidad;
}

public Producto getProducto(){
    return producto;
}

public int getCantidad(){
    return cantidad;
}

public double getPrecioUnitario(){
    return precioUnitario;
}


}
