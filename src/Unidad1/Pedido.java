

package Unidad1;

public class Pedido {
   private String codigoPedido;
   private final static int contadorPedidos = 0;
   private String estado;
   
   public String getcodigoPedido (){
       return codigoPedido;
   }
   public String getestado (){
       return estado;
   }
   public boolean retirarDetalle(String codigoProducto){
       if (!"BORRADOR".equals(estado) || codigoProducto == null || codigoProducto.trim().isEmpty()) {
           return false;
       }
       for (int i = 0; i < detalles.size(); i++) {
           if (detalles.get(i).getProducto().getCodigoProducto().equals(codigoProducto.trim())) {
               detalles.remove(i);
           return true;
           }
       }
       return false;
   }
   public double calcularTotal() {
       double total = 0;
       for (DetallePedido detalle : detalles) {
           total += detalle.getSubtotal();
       }
       return total;
   }
}
   
