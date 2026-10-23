/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author CLAUDIA
 */
public class NovedadesMargarita {
    public static void main(String[] args) {
        // 1. Cliente
        
        System.out.println("CLIENTE");
        
        Cliente cliente = new Cliente("Ana Lopez", "987654321");
        
        System.out.println("Codigo: " + cliente.getCodigoCliente());
        System.out.println("Nombre: " + cliente.getNombre());
        
        cliente.setTelefono("912345678");
        
        System.out.println("Telefono actualizado: " + cliente.getTelefono());
        
         // 2. Producto
         
         System.out.println("\nPRODUCTOS");
         
         Producto polo = new Producto(
                  "Polo negro talla M", "Algodon", 20.0);
         
         Producto pulsera = new Producto("Pulsera", 8.0);
         System.out.println(polo.getCodigoProducto() + ": " + polo.getNombre());
         
         System.out.println( pulsera.getCodigoProducto() + ": " + pulsera.getNombre());
         
         System.out.println("Descripcion del polo: " + polo.getDescripcion());
         
         // 3. Catalogo
         
         System.out.println("\nCATALOGO");
         
         Catalogo general = new Catalogo();
           Catalogo catalogo = new Catalogo( "Margarita", "Productos de la tienda");
           
            System.out.println("Nombre por defecto: " + general.getNombre());
            
            catalogo.setDescripcion("Novedades y accesorios");
            
            System.out.println(catalogo.getNombre() + ": " + catalogo.getDescripcion());
            
            // 4. Detallepedido
            
            System.out.println("\nDETALLE DEL PRODUCTO");
            
            DetallePedido detalle = new DetallePedido( polo.getCodigoProducto(), 3, polo.getPrecio());
            
            System.out.println("Producto: " + detalle.getCodigoProducto());
             System.out.println("Cantidad: " + detalle.getCantidad());
             System.out.println("Precio aplicado: " + detalle.getPrecioUnitario());
             System.out.println("Subtotal: " + detalle.getSubtotal());
             
             polo.setPrecio(25.0);
             
             System.out.println("Precio vigente actualizado: " + polo.getPrecio());
             System.out.println("Subtotal conservado: " + detalle.getSubtotal());
             
             // 5. Inventario
             
             System.out.println("\nINVENTARIO: PRUEBA INDEPENDIENTE");
             
             Inventario inventario = new Inventario( polo.getCodigoProducto(), 10);
             
             System.out.println("Ingreso de 5: " + inventario.registrarIngreso(5));
             
             System.out.println("Reserva de 3: " + inventario.reservarUnidades(3));
             
              System.out.println("Disponible: " + inventario.getCantidadDisponible());
              
              System.out.println("Reservar 20: " + inventario.reservarUnidades(20));
              
              System.out.println( "Entregar 2: " + inventario.registrarEntrega(2));
              
              System.out.println("Liberar 1: " + inventario.liberarUnidades(1));
              
              System.out.println("Fisica final: " + inventario.getCantidadFisica());
              
              System.out.println( "Reservada final: " + inventario.getCantidadReservada());
              
              System.out.println( "Disponible final: " + inventario.getCantidadDisponible());
             
         // 6. Pedido
         
          System.out.println("\nPEDIDO: PRUEBA DEL BORRADOR");
          
          Pedido pedido = new Pedido(cliente.getCodigoCliente());
          
          System.out.println("Pedido: " + pedido.getCodigoPedido());
          System.out.println("Cliente: " + pedido.getCodigoCliente());
          System.out.println("Estado inicial: " + pedido.getEstado());
          
          System.out.println("Cancelar: " + pedido.cancelar());
           System.out.println("Cancelar otra vez: " + pedido.cancelar());
           System.out.println("Estado final: " + pedido.getEstado());
           
           // 7. Reserva
         
           System.out.println("\nRESERVA: PRUEBAS INDEPENDIENTES DE ESTADO");
           
           Reserva reservaEntrega = new Reserva("PED-DEMO-1");
           
           System.out.println("Estado inicial: " + reservaEntrega.getEstado());
            System.out.println("Activar: " + reservaEntrega.activar());
            
            System.out.println("Completar: " + reservaEntrega.completarEntrega());
            
            System.out.println("Completar otra vez: " + reservaEntrega.completarEntrega());
            
            System.out.println("Estado final: " + reservaEntrega.getEstado());
            
            Reserva reservaLiberada = new Reserva("PED-DEMO-2");
            
            reservaLiberada.activar();
            
            System.out.println("Liberar otra reserva activa: " + reservaLiberada.liberar());
            
            System.out.println("Estado de esa reserva: " + reservaLiberada.getEstado());
            
             // 8. Entrega
             
             System.out.println("\nENTREGA: PRUEBA DEL REGISTRO");
            
        Entrega entrega = new Entrega(reservaEntrega.getCodigoPedido(), "23/10/2026 10:30");
        
        System.out.println("Codigo del pedido: " + entrega.getCodigoPedido());
        System.out.println("Fecha registrada: " + entrega.getFechaEntrega());
        
        
 
        
    }
   
    
}
