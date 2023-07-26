import java.util.Scanner;

public class SistemaReparto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String direccionTienda = "Dirección de Tienda Desconocida";

        System.out.println("--------- BIENVENIDO A LA TIENDA DE LAS MEJORES BOLSAS DEL MERCADO ---------");
        System.out.println("Seleccione la dirección de la tienda:");
        
        System.out.println("Ingrese una opción:");

        int opcionDireccion;

        boolean entradaValida = false;

        do {
            try {
                System.out.println("Elija una opción de dirección:");
                System.out.println("1. Plaza Cristal");
                System.out.println("2. Plaza Ambar");

                opcionDireccion = Integer.parseInt(scanner.nextLine());

                switch (opcionDireccion) {
                    case 1:
                        direccionTienda = "Plaza Cristal";
                        entradaValida = true;
                        break;
                    case 2:
                        direccionTienda = "Plaza Ambar";
                        entradaValida = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una dirección válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            }
        } while (!entradaValida);

        System.out.println("La dirección de la tienda es: " + direccionTienda);

        Repartidor[] repartidores = {
                new Repartidor("Juan", "Perez", 25, direccionTienda, "664-152-1020", "Moto"),
                new Repartidor("Martin", "Estrada", 30, direccionTienda, "961-125-1000", "Bicicleta"),
                new Repartidor("Samuel", "Morales", 28, direccionTienda, "961-152-1500", "Auto"),
                new Repartidor("Brandon", "Gomez", 35, direccionTienda, "961-158-1230", "Camioneta")
        };

        Vendedor[] vendedores = {
                new Vendedor("Irving", "Champo", 25, direccionTienda, 100, "152"),
                new Vendedor("Angel", "Garcia", 22, direccionTienda, 200, "561"),
                new Vendedor("Pedro", "Lopez", 28, direccionTienda, 150, "103")
        };

        Cliente cliente = new Cliente("Nombre del Cliente", "Apellido del Cliente", 0, "Dirección del Cliente");
        cliente.asignarVendedor(vendedores);

        int opcion;
        do {
            System.out.println("------ MENÚ ------");
            System.out.println("Sistema de Reparto");
            System.out.println("1. Ver modelos de bolsas");
            System.out.println("2. Ver empleados disponibles");
            System.out.println("3. Ver detalles del repartidor");
            System.out.println("4. Dirección de la tienda");
            System.out.println("5. Realizar pedido");
            System.out.println("6. Detalles de envío");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opción:");

            opcion = obtenerEntero(scanner);

            switch (opcion) {
                case 1:
                    Producto productos = new Producto();
                    productos.mostrarMarcasBolsas();
                    System.out.println("Ingrese el nombre de la marca de bolsa:");
                    String nombreMarca = scanner.nextLine();
                    System.out.println("----------------------------------");
                    productos.mostrarModelosBolsa(nombreMarca);
                    break;
                case 2:
                    System.out.println("---------- VENDEDORES DISPONIBLES -----------:");
                    Vendedor.mostrarVendedores(vendedores);
                    break;
                case 3:
                    System.out.println("Detalles del Repartidor:");
                    Repartidor.mostrarRepartidores(repartidores);
                    break;
                case 4:
                    System.out.println("--------- DIRECCIONES DE TIENDA ----------:");
                    System.out.println("Tienda 1: Plaza Cristal");
                    System.out.println("----------------------------------");
                    System.out.println("Tienda 2: Plaza Ambar");
                    System.out.println("----------------------------------");
                    break;
                case 5:
                    cliente.agregarDatosPedido();
                    cliente.mostrarInformacion();  
                    cliente.realizarPedido(repartidores, vendedores);
                    break;
                case 6:
                    cliente.mostrarInformacion();
                    System.out.println("Dirección de envío: " + cliente.getDireccion());
                    break;
                case 7:
                    cliente.mostrarHistorialDetallado();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 7);
    }

    private static int obtenerEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }
}




