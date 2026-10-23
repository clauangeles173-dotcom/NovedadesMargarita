// autor: PANDO REYES JOAQUIN ADRIAN

package Unidad1;

// Esta clase se encarga de registrar la identificación y contacto del solicitante.
// Los productos solicitados, cantidades y estados se registran en 'Pedido' y sus detalles.

public class Cliente {

    // ATRIBUTOS

    // Identificador textual del cliente. Se conserva después de crear el cliente.
    private final String codigoCliente;    
    // Secuencia compartida. No identifica por sí mismo a una persona.
    private static int contadorClientes = 0;
    // Nombre del cliente. Puede corregirse mediante una operación validada.
    private String nombres;
    // Contacto del cliente. Se conserva como texto para no perder prefijos o ceros.
    private String telefono;
    
    // METODOS

    // Constructor. Inicializa un cliente válido y genera su código.
    public Cliente(String nombres, String telefono) {
        // Tras recibir el nombre y el telefono ingresados, se comprueba que ninguno sea nulo o vacio.
        // Toda inclusión de .trim elimina espacios añadidos por error al inicio y al final.
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono es obligatorio.");
        }
        // Si nombre y teléfono son validos, se procede a incrementar el contador de clientes
        contadorClientes++;
        
        // Se forma un código siguiendo el formato CLI-XXXX. Por ejemplo, el primer cliente recibirá el codigo CLI-0001.
        // Si llegase a superar los 9999 clientes, el formato simplemente se expande a CLI-XXXXX.
        this.codigoCliente = String.format("CLI-%04d", contadorClientes);
        this.nombres = nombres.trim();
        this.telefono = telefono.trim();
    }
    
    // Getter para codigoCliente. Devuelve el código del cliente sin modificarlo.
    public String getCodigoCliente() {
        return codigoCliente;
    }
    
    // Getter para nombres. Devuelve el nombre actual. 
    public String getNombres() {
        return nombres;
    }
    
    // Getter para telefono. Devuelve el teléfono actual.
    public String getTelefono() {
        return telefono;
    }
    
    // Setter para nombres. Valida el nuevo nombre.
    // Si es válido, reemplaza el anterior; si es inválido, conserva el dato anterior.
    public void setNombre(String nombre) {
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        
        this.nombres = nombres.trim();
    }
    
    // Setter para telefono. Valida el nuevo teléfono.
    // Si es válido, lo actualiza; si es inválido, conserva el dato anterior.
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono es obligatorio.");
        }
        
        this.telefono = telefono.trim();
    }

}