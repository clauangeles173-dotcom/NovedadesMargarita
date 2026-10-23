
package Unidad1;

// Esta clase se encarga de registrar la identificación, descripción y precio vigente de un artículo.
// Las cantidades físicas y reservadas se controlan en 'Inventario'; el precio aplicado al pedido se conserva en 'DetallePedido'.

public class Producto {
    
    // ATRIBUTOS

    // Identificador textual del producto. Se conserva después de crear el producto.
    private final String codigoProducto;
    // Secuencia compartida. No identifica por sí mismo a un producto.
    private static int contadorProducto = 0;
    // Nombre que distingue el artículo o variante, por ejemplo 'Polo negro talla M'.
    private String nombre;
    // Información adicional. Es opcional y puede conservarse como una cadena vacía.
    private String descripcion;
    // Precio unitario vigente del producto. Se propone aceptar valores finitos y no negativos.
    private double precio;
    
    // METODOS
    
    // Constructor. Registra un artículo con su nombre y precio. La descripción queda como una cadena vacía.
    public Producto(String nombre, double precio) {
        this(nombre, "", precio);
    }
    
    // Constructor. Registra el artículo e incluye información adicional.
    // Es sobrecargado y comparte nombre con el método anterior.
    public Producto(String nombre, String descripcion, double precio) {
        // Tras recibir el nombre y el precio ingresados, se comprueba que ninguno sea nulo o vacio.
        // Toda inclusión de .trim elimina espacios añadidos por error al inicio y al final
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto es obligatorio.");
        }
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException("El precio debe ser finito y no negativo.");
        }
        // Si nombre y precio son validos, se procede a incrementar el contador de productos
        contadorProducto++;
        
        // Se forma un código siguiendo el formato PRO-XXXX. Por ejemplo, el primer producto recibirá el codigo PRO-0001.
        // Si llegase a superar los 9999 productos, el formato simplemente se expande a PRO-XXXXX.
        this.codigoProducto = String.format("PRO-%04d", contadorProducto);
        this.nombre = nombre.trim();
        // Verifica si la descripción es o no una cadena vacia.
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion.trim();
        }
        this.precio = precio;
    }

    // Getter para codigoProducto. Consulta el identificador fijo.
    public String getCodigoProducto() {
        return codigoProducto;
    }
    
    // Getter para nombre. Consulta el nombre actual.
    public String getNombre() {
        return nombre;
    }
    
    // Getter para descripcion. Consulta la información adicional.
    public String getDescripcion() {
        return descripcion;
    }
    
    // Getter para precio. Consulta el precio comercial vigente.
    public double getPrecio() {
        return precio;
    }
    
    // Setter para nombre. Valida y actualiza el nombre; ante una entrada invalida conserva el anterior.
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto es obligatorio.");
        }
        
        this.nombre = nombre.trim();
    }
    
    // Setter para descripcion. Actualiza la información opcional; una descripción no proporcionada se conserva vacía.
    public void setDescripcion(String descripcion) {
        if (descripcion == null) {
            this.descripcion = "";
        } else {
            this.descripcion = descripcion.trim();
        }
    }
 
    // Acepta un número finito y no negativo; ante una entrada inválida conserva el precio anterior.
    public void setPrecio(double precio) {
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException("El precio debe ser finito y no negativo.");
        }
        
        this.precio = precio;
    }
}