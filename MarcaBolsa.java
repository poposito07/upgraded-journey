import java.util.ArrayList;
import java.util.List;

class MarcaBolsa {
    private String nombre;
    private List<ModeloBolsa> modelos;

    public MarcaBolsa(String nombre) {
        this.nombre = nombre;
        modelos = new ArrayList<>();
    }

    public void agregarModelo(ModeloBolsa modelo) {
        modelos.add(modelo);
    }

    public String getNombre() {
        return nombre;
    }

    public List<ModeloBolsa> getModelos() {
        return modelos;
    }
}