import java.util.Random;

class Vendedor extends Persona {
    private String direccionTienda;
    private int ventasMensuales;
    private String codigoVendedor;

    public Vendedor(String nombre, String apellido, int edad, String direccionTienda, int ventasMensuales, String codigoVendedor) {
        super(nombre, apellido, edad, direccionTienda);
        this.direccionTienda = direccionTienda;
        this.ventasMensuales = ventasMensuales;
        this.codigoVendedor = codigoVendedor;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public int getVentasMensuales() {
        return ventasMensuales;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    @Override
    public double calcularSalario() {
        
        return 0.0; 
    }

    public static Vendedor obtenerVendedorAleatorio(Vendedor[] vendedores) {
        Random random = new Random();
        int indice = random.nextInt(vendedores.length);
        return vendedores[indice];
    }

    public static void mostrarVendedores(Vendedor[] vendedores) {
        for (Vendedor vendedor : vendedores) {
            System.out.println("Nombre: " + vendedor.getNombre() + " " + vendedor.getApellido());
            System.out.println("----------------------------------");
            System.out.println("Edad: " + vendedor.getEdad());
            System.out.println("----------------------------------");
            System.out.println("Dirección de Tienda: " + vendedor.getDireccionTienda());
            System.out.println("----------------------------------");
            System.out.println("Ventas Mensuales: " + vendedor.getVentasMensuales());
            System.out.println("----------------------------------");
            System.out.println("Código de Vendedor: " + vendedor.getCodigoVendedor());
            System.out.println("----------------------------------");
        }
    }
}
