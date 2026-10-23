

package Unidad1;

public class Pedido {
  

    
    private final String codigoPedido;

    
    private static int contadorPedidos = 0;

   
    private final String codigoCliente;

   
    private String estado = "BORRADOR";

    

    public Pedido(String codigoCliente) {
       
        if (codigoCliente == null || codigoCliente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del cliente es obligatorio.");
        }

        
        contadorPedidos++;

        this.codigoPedido =
                String.format("PED-%04d", contadorPedidos);

        this.codigoCliente = codigoCliente.trim();
    }

   

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getEstado() {
        return estado;
    }

    
    public boolean cancelar() {
        if (!"BORRADOR".equals(estado)) {
            return false;
        }

        this.estado = "CANCELADO";
        return true;
    }
}
   
