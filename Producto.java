import java.util.ArrayList;
import java.util.List;

public class Producto {
    private List<MarcaBolsa> marcas;

    public Producto() {
        marcas = new ArrayList<>();

        MarcaBolsa marca1 = new MarcaBolsa("Bolso de Mano");
        marca1.agregarModelo(new ModeloBolsa("Bolso de piel", "001", 1800.0, new String[]{"Todos los colores"}));
        marca1.agregarModelo(new ModeloBolsa("Prada", "002", 1500.0, new String[]{"Todos los colores"}));
        marca1.agregarModelo(new ModeloBolsa("Bolso de Moda", "003", 1200.0, new String[]{"Todo los colores"}));

        MarcaBolsa marca2 = new MarcaBolsa("Bolso chico");
        marca2.agregarModelo(new ModeloBolsa("Bolso de Piel", "004", 8100.0, new String[]{"Todos los colores"}));
        marca2.agregarModelo(new ModeloBolsa("Bolso Pandora", "005", 9200.0, new String[]{"Todos los colores"}));
        marca2.agregarModelo(new ModeloBolsa("Bolso exclusivo", "006", 10000.0, new String[]{"Todos los corores"}));

        MarcaBolsa marca3 = new MarcaBolsa("Mochila");
        marca3.agregarModelo(new ModeloBolsa("Nike", "007", 2000.0, new String[]{"Todos los colores"}));
        marca3.agregarModelo(new ModeloBolsa("Adidas", "008", 1800.0, new String[]{"Todos los colores"}));
        marca3.agregarModelo(new ModeloBolsa("Convers", "009", 2200.0, new String[]{"Todos los colores"}));

        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
    }

    public void mostrarMarcasBolsas() {
        System.out.println("Marcas de bolsas disponibles:");
        for (MarcaBolsa marca : marcas) {
            System.out.println("- " + marca.getNombre());
        }
    }

    public void mostrarModelosBolsa(String nombreMarca) {
        for (MarcaBolsa marca : marcas) {
            if (marca.getNombre().equalsIgnoreCase(nombreMarca)) {
                System.out.println("Modelos de bolsa de la marca " + marca.getNombre() + ":");
                for (ModeloBolsa modelo : marca.getModelos()) {
                    System.out.println("ID: " + modelo.getId());
                    System.out.println("Modelo: " + modelo.getNombre());
                    System.out.println("Precio: $" + modelo.getPrecio());
                    System.out.print("Colores: ");
                    for (String color : modelo.getColores()) {
                        System.out.print(color + " ");
                    }
                    System.out.println("\n");
                }
                return;
            }
        }
        System.out.println("No se encontró la marca de bolsa especificada.");
    }

    private static boolean esNombreValido(String nombre) {
        return nombre.matches("^[a-zA-Z0-9 ]+$");
    }

    public boolean existeProducto(String nombreProducto) {
        for (MarcaBolsa marca : marcas) {
            for (ModeloBolsa modelo : marca.getModelos()) {
                if (modelo.getNombre().equalsIgnoreCase(nombreProducto)) {
                    return true;
                }
            }
        }
        return false;
}

}

    
