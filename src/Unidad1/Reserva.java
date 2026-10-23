/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author fcag2
 */
public class Reserva {
   

    private final String codigoPedido;
    private String estado = "PENDIENTE";

    

    public Reserva(String codigoPedido) {
        if (codigoPedido == null || codigoPedido.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del pedido es obligatorio.");
        }

        this.codigoPedido = codigoPedido.trim();
    }

    

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getEstado() {
        return estado;
    }

   

    
    public boolean activar() {
        if (!"PENDIENTE".equals(estado)) {
            return false;
        }

        this.estado = "ACTIVA";
        return true;
    }

   
    public boolean liberar() {
        if (!"ACTIVA".equals(estado)) {
            return false;
        }

        this.estado = "LIBERADA";
        return true;
    }

   
    public boolean completarEntrega() {
        if (!"ACTIVA".equals(estado)) {
            return false;
        }

        this.estado = "COMPLETADA";
        return true;
    } 
}
