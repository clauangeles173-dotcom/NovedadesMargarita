/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author fcag2
 */
public class Entrega {
    

    private final String codigoPedido;
    private final String fechaEntrega;

   
    public Entrega(String codigoPedido, String fechaEntrega) {
        if (codigoPedido == null || codigoPedido.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del pedido es obligatorio.");
        }

        if (fechaEntrega == null || fechaEntrega.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La fecha de entrega es obligatoria.");
        }

        this.codigoPedido = codigoPedido.trim();
        this.fechaEntrega = fechaEntrega.trim();
    }

    

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }
}
