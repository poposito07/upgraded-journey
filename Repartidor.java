import java.util.Random;

class Repartidor extends Persona {
    private String direccionTienda;
    private String telefonoContacto;
    private String medioTransporte;

    public Repartidor(String nombre, String apellido, int edad, String direccionTienda, String telefonoContacto, String medioTransporte) {
        super(nombre, apellido, edad, direccionTienda);
        this.direccionTienda = direccionTienda;
        this.telefonoContacto = telefonoContacto;
        this.medioTransporte = medioTransporte;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    @Override
    public double calcularSalario() {
        
        return 0.0;
    }

    public static Repartidor obtenerRepartidorAleatorio(Repartidor[] repartidores) {
        Random random = new Random();
        int indice = random.nextInt(repartidores.length);
        return repartidores[indice];
    }

    public static void mostrarRepartidores(Repartidor[] repartidores) {
        for (Repartidor repartidor : repartidores) {
            System.out.println("Nombre: " + repartidor.getNombre() + " " + repartidor.getApellido());
            System.out.println("----------------------------------");
            System.out.println("Edad: " + repartidor.getEdad());
            System.out.println("----------------------------------");
            System.out.println("Dirección de Tienda: " + repartidor.getDireccionTienda());
            System.out.println("----------------------------------");
            System.out.println("Teléfono de Contacto: " + repartidor.getTelefonoContacto());
            System.out.println("----------------------------------");
            System.out.println("Medio de Transporte: " + repartidor.getMedioTransporte());
            System.out.println("----------------------------------");
        }
    }
}
