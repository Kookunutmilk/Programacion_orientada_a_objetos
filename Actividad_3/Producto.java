import java.util.Scanner;

class Producto {
    private String descripcion;
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;

    // Constructor vacío
    public Producto() {}

    // Métodos getter
    public String getDescripcion() { return descripcion; }
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public double getCosto() { return costo; }
    public double getImpuesto() { return impuesto; }

    // Métodos setter
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCosto(double costo) { this.costo = costo; }
    public void setImpuesto(double impuesto) { this.impuesto = impuesto; }

    // Método para mostrar los atributos del producto
    public void muestraProducto() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto);
    }

    // Método para calcular el precio de venta
    public double calcularPrecio(double utilidad) {
        double precioAntesImpuestos = costo + (costo * utilidad / 100);
        return precioAntesImpuestos + (precioAntesImpuestos * impuesto / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        System.out.println("Ingrese los datos del primer producto:");
        ingresarDatosProducto(scanner, producto1);
        
        System.out.println("Ingrese los datos del segundo producto:");
        ingresarDatosProducto(scanner, producto2);

        System.out.println("\nInformación del primer producto:");
        producto1.muestraProducto();
        System.out.println("\nInformación del segundo producto:");
        producto2.muestraProducto();
        
        System.out.print("Ingrese el porcentaje de utilidad para el cálculo del precio: ");
        double utilidad = scanner.nextDouble();
        
        String productoMasCaro = compararProductos(producto1, producto2, utilidad);
        System.out.println("\nEl producto con mayor precio de venta es: " + productoMasCaro);
    }

    // Método para ingresar los datos de un producto con validación de entrada
    public static void ingresarDatosProducto(Scanner scanner, Producto producto) {
        try {
            System.out.print("Descripción: ");
            producto.setDescripcion(scanner.next());

            System.out.print("Código: ");
            producto.setCodigo(scanner.next());

            System.out.print("Tipo: ");
            producto.setTipo(scanner.next());

            System.out.print("Costo: ");
            producto.setCosto(scanner.nextDouble());

            System.out.print("Impuesto (%): ");
            producto.setImpuesto(scanner.nextDouble());
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos. Intente de nuevo.");
            scanner.nextLine(); // Limpiar el buffer
            ingresarDatosProducto(scanner, producto);
        }
    }

    // Método para comparar dos productos y devolver el de mayor precio
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);
        return precio1 > precio2 ? p1.getDescripcion() : p2.getDescripcion();
    }
}
