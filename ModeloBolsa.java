class ModeloBolsa {
    private String nombre;
    private String id;
    private double precio;
    private String[] colores;

    public ModeloBolsa(String nombre, String id, double precio, String[] colores) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.colores = colores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String[] getColores() {
        return colores;
    }
}