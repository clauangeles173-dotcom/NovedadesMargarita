/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author fcag2
 */
public class Inventario {

    private final String codigoProducto;
    private int cantidadFisica;
    private int cantidadReservada = 0;

    

    public Inventario(String codigoProducto, int cantidadInicial) {
        if (codigoProducto == null || codigoProducto.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del producto es obligatorio.");
        }

        if (cantidadInicial < 0) {
            throw new IllegalArgumentException(
                    "La cantidad inicial no puede ser negativa.");
        }

        this.codigoProducto = codigoProducto.trim();
        this.cantidadFisica = cantidadInicial;
    }

   

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidadFisica() {
        return cantidadFisica;
    }

    public int getCantidadReservada() {
        return cantidadReservada;
    }

    
    public int getCantidadDisponible() {
        return cantidadFisica - cantidadReservada;
    }

   

    
    public boolean registrarIngreso(int cantidad) {
        
        if (cantidad <= 0
                || cantidad > Integer.MAX_VALUE - cantidadFisica) {
            return false;
        }

        this.cantidadFisica += cantidad;
        return true;
    }

   
    public boolean reservarUnidades(int cantidad) {
        if (cantidad <= 0 || cantidad > getCantidadDisponible()) {
            return false;
        }

        this.cantidadReservada += cantidad;
        return true;
    }

    
    public boolean liberarUnidades(int cantidad) {
        if (cantidad <= 0 || cantidad > cantidadReservada) {
            return false;
        }

        this.cantidadReservada -= cantidad;
        return true;
    }

    
    public boolean registrarEntrega(int cantidad) {
        if (cantidad <= 0 || cantidad > cantidadReservada) {
            return false;
        }

        this.cantidadFisica -= cantidad;
        this.cantidadReservada -= cantidad;
        return true;
    }
}  

