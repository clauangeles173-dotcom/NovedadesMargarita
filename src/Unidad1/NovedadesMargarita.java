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
    }
   
    
}
