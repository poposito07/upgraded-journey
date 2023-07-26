abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;

    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("----------------------------------");
        System.out.println("Edad: " + edad);
        System.out.println("----------------------------------");
        System.out.println("Dirección: " + direccion);
        System.out.println("----------------------------------");
    }

    public abstract double calcularSalario();
}