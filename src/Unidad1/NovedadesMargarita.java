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
            
            
         
         
        
        
        
        
        
        
        
    }
   
    
}
