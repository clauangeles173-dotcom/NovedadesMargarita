/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author fcag2
 */
public class Catalogo {
   

    private String nombre;
    private String descripcion;

    
    public Catalogo() {
        this("Catalogo general", "");
    }

    
    public Catalogo(String nombre, String descripcion) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre del catalogo es obligatorio.");
        }

        this.nombre = nombre.trim();

       
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion.trim();
        }
    }

  

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

   
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre del catalogo es obligatorio.");
        }

        this.nombre = nombre.trim();
    }

    
    public void setDescripcion(String descripcion) {
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion.trim();
        }
    } 
}
