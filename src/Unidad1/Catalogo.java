
package Unidad1;

public class Catalogo {
    //Declaracion de atributos de catalogo
    private String nombre;
    private String descripcion;
    
    //Constructor Catalogo, donde valida el la existencia del parametro nombre y el parametro descripcion
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