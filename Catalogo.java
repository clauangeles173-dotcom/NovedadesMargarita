import java.util.ArrayList;

public class Catalogo {

    private final ArrayList<Producto> productos;

    // Constructor
    public Catalogo() {
        this.productos = new ArrayList<>();
    }

    // Agregar un producto
    public boolean agregarProducto(Producto producto) {
        if (producto == null) {
            return false;
        }

        String codigo = producto.getCodigoProducto();

        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }

        if (buscarProducto(codigo) != null) {
            return false;
        }

        return productos.add(producto);
    }

    // Buscar un producto por su código
    public Producto buscarProducto(String codigoProducto) {
        if (codigoProducto == null ||
                codigoProducto.trim().isEmpty()) {
            return null;
        }

        String codigoBuscado = codigoProducto.trim();

        for (Producto producto : productos) {
            if (producto.getCodigoProducto() != null &&
                    producto.getCodigoProducto().trim()
                    .equals(codigoBuscado)) {
                return producto;
            }
        }

        return null;
    }

    // Obtener todos los productos
    public ArrayList<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    // Retirar un producto por su código
    public boolean retirarProducto(String codigoProducto) {
        Producto encontrado = buscarProducto(codigoProducto);

        if (encontrado == null) {
            return false;
        }

        return productos.remove(encontrado);
    }

    // Contar la cantidad de productos
    public int cantidadProductos() {
        return productos.size();
    }
}
