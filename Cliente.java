import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cliente extends Persona {
    private String direccion;
    private String numeroCasa;
    private int numeroCelular;
    private String referencia;
    private List<String> productos;
    private List<String> colores;
    private List<Integer> cantidades;
    private Repartidor repartidorAsignado;
    private Vendedor vendedorAsignado;
    private int contadorPedidos;
    private Cliente cliente;
    
    

    public Cliente(String nombre, String apellido, int edad, String direccion) {
        super(nombre, apellido, edad, direccion);
        this.direccion = direccion;
        this.numeroCasa = "";
        this.numeroCelular = 0;
        this.referencia = "";
        this.productos = new ArrayList<>();
        this.colores = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.repartidorAsignado = null;
        this.vendedorAsignado = null;
        this.contadorPedidos = 1;

    }

    public void agregarDatosPedido() {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        String opcion1 = "S";

        System.out.println("Recuerde que contamos con");;
        Producto producto = new Producto();
        producto.mostrarMarcasBolsas();
        System.out.println("(Si desea ver los modelos disponibles, valla al apartado de bolsas)");
      
        
               
                do {
                    String nombreProducto;
                    boolean productoValido;
        
                    do {
                        System.out.println("Ingrese el nombre del producto a comprar:");
                        nombreProducto = scanner.nextLine().trim();
                        productoValido = producto.existeProducto(nombreProducto);
                        if (!productoValido) {
                            System.out.println("El producto no existe, ingrese un nombre válido.");
                        }
                    } while (!productoValido);
        
                    System.out.println("----------------------------------");
                    String color;
                    do {
                        System.out.println("Ingrese el color:");
                        color = scanner.nextLine().trim();
                        if (!color.matches("^[a-zA-Z ]+$")) {
                            System.out.println("El color no puede contener números ni caracteres especiales.");
                        }
                    } while (!color.matches("^[a-zA-Z ]+$"));
        
                    System.out.println("----------------------------------");
        
                    int cantidad =0;
                    boolean validInput = false;
        
                    while (!validInput) {
                        System.out.println("Ingrese la cantidad deseada (número entero): ");
                        try {
                            cantidad = Integer.parseInt(scanner.nextLine());
                            validInput = true; 
                        } catch (NumberFormatException e) {
                            System.out.println("La cantidad debe ser un número entero válido.");
                        }
                    }
        
                    productos.add(nombreProducto);
                    colores.add(color);
                    cantidades.add(cantidad);
        
                    System.out.println("¿Desea agregar otro producto? (S/N):");
                    opcion = scanner.nextLine();
                    
                    if (opcion.equalsIgnoreCase("S")) {
                        System.out.println("Ingrese el nombre del producto a eliminar del pedido:");
                        String nombreProductoEliminar = scanner.nextLine();
                        eliminarProducto(nombreProductoEliminar);
                    }
                } while (opcion.equalsIgnoreCase("S"));
        
            
          
            

            do {
                System.out.println("Ingrese su nombre:");
                nombre = scanner.nextLine().trim();
            } while (!esNombreValido(nombre));
    
            do {
                System.out.println("----------------------------------");
                System.out.println("Ingrese su apellido:");
                apellido = scanner.nextLine().trim();
            } while (!esApellidoValido(apellido));
    
            
            System.out.println("----------------------------------");
            System.out.println("Ingrese su dirección:");
            direccion = scanner.nextLine().trim();
            
    
            System.out.println("----------------------------------");
            System.out.println("Ingrese el número de casa:");
            numeroCasa = scanner.nextLine().trim();
    

            System.out.println("----------------------------------");
            System.out.println("Ingrese su número de celular:");
           
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.println("Ingrese su número de celular (debe tener 10 dígitos):");

            String numeroCelularStr;
        do {
            numeroCelularStr = scanner.nextLine().trim();
            if (numeroCelularStr.matches("\\d{10}")) {
            break;
        } else {
        System.out.println("El número de celular debe tener exactamente 10 dígitos. Ingrese nuevamente:");
    }
        } while (true);

        long numeroCelular = Long.parseLong(numeroCelularStr);

       
            System.out.println("----------------------------------");
            System.out.println("Ingrese una referencia:");
            referencia = scanner.nextLine().trim();

            System.out.println("----------------------------------");

            System.out.println("Datos ingresados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Dirección: " + direccion);
            System.out.println("Número de casa: " + numeroCasa);
            System.out.println("Número de celular: " + numeroCelular);
            System.out.println("Referencia: " + referencia);

        }
        public long getNumeroCelular() {
            return numeroCelular;
        }
       
        
        private void setNumeroCelular(long numeroCelular2) {
    }

        private void setNumeroCasa(String numeroCasa2) {
    }

        private boolean esNumeroValido(String numeroCelular2) {
        return false;
    }

        private boolean esDireccionValido(String direccion2) {
        return false;
    }

        private static boolean esNombreValido(String nombre) {
            if (nombre.matches("^[a-zA-Z ]+$")) {
                return true;
            } else {
                System.out.println("El nombre no debe contener puntos ni caracteres especiales.");
                return false;
            }
        }
    
        private static boolean esApellidoValido(String apellido) {
            if (apellido.matches("^[a-zA-Z ]+$")) {
                return true;
            } else {
                System.out.println("El apellido no debe contener puntos ni caracteres especiales.");
                return false;
            }
        }
    
        
        public void eliminarProducto(String nombreProducto) {
            int indiceProducto = productos.indexOf(nombreProducto);
        
            if (indiceProducto != -1) {
                productos.remove(indiceProducto);
                colores.remove(indiceProducto);
                cantidades.remove(indiceProducto);
                System.out.println("Producto eliminado del pedido.");
            } else {
                System.out.println("El producto no está en el pedido.");
            }
        }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("----------------------------------");
        System.out.println("Apellido: " + getApellido());
        System.out.println("----------------------------------");
        System.out.println("Dirección: " + direccion);
        System.out.println("----------------------------------");
        System.out.println("Número de casa: " + numeroCasa);
        System.out.println("----------------------------------");
        System.out.println("Número de celular: " + numeroCelular);
        System.out.println("----------------------------------");
        System.out.println("Referencia: " + referencia);
        System.out.println("----------------------------------");
    }

    public void asignarVendedor(Vendedor[] vendedores) {
        Random random = new Random();
        vendedorAsignado = vendedores[random.nextInt(vendedores.length)];
    }

    public void realizarPedido(Repartidor[] repartidores, Vendedor[] vendedores) {
        System.out.println("Pedido #" + contadorPedidos);
        System.out.println("----------------------------------");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto: " + productos.get(i));
            System.out.println("Cantidad: " + cantidades.get(i));
            System.out.println("----------------------------------");
        }

        Random random = new Random();
        repartidorAsignado = repartidores[random.nextInt(repartidores.length)];
        System.out.println("Repartidor asignado: " + repartidorAsignado.getNombre());
        System.out.println("----------------------------------");

        vendedorAsignado = vendedores[random.nextInt(vendedores.length)];
        System.out.println("Vendedor asignado: " + vendedorAsignado.getNombre());
        System.out.println("----------------------------------");

        contadorPedidos++;
    }

    public void mostrarHistorialDetallado() {
        if (repartidorAsignado == null) {
            System.out.println("No hay pedidos registrados.");
        } else {
            System.out.println("Detalles de envío:");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Producto: " + productos.get(i));
                System.out.println("Color: " + colores.get(i));
                System.out.println("Cantidad: " + cantidades.get(i));
                System.out.println("----------------------------------");
            }
            System.out.println("Repartidor asignado: " + repartidorAsignado.getNombre());
            System.out.println("Vendedor asignado: " + vendedorAsignado.getNombre());
            System.out.println("----------------------------------");
        }
    }
    public double calcularSalario() {
        return 0.0;
    }
}


