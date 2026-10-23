
package Unidad1;

/**
 *
 * @author Aldave
 */
public class DetallePedido {
  

    private final String codigoProducto;
    private final int cantidad;
    private final double precioUnitario;

   

    public DetallePedido(String codigoProducto, int cantidad,
                         double precioUnitario) {

        if (codigoProducto == null || codigoProducto.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del producto es obligatorio.");
        }
        else{
                    this.codigoProducto = codigoProducto.trim();
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser mayor que cero.");
        }
        else{
                this.cantidad = cantidad;
        }

        if (!Double.isFinite(precioUnitario) || precioUnitario < 0) {
            throw new IllegalArgumentException(
                    "El precio debe ser finito y no negativo.");
        }
        else{
                this.precioUnitario = precioUnitario;
        }

        
        if (!Double.isFinite(cantidad * precioUnitario)) {
            throw new IllegalArgumentException(
                    "El subtotal supera el rango permitido.");
        }

    }

    
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    
    public double getSubtotal() {
        return cantidad * precioUnitario;
    }


}
