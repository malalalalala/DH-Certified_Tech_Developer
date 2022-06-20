package ValvaÁrboles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArbolFactory {

    private List<Arbol> arboles = new ArrayList<>();
    private Map<String, Arbol> tiposArboles = new HashMap<>();

    public void agregarArbol(String tipo) {
        Arbol arbol = tiposArboles.get(tipo);
        if (arbol == null) {
            System.out.println("Plantando un nuevo árbol, inexistente en el bosque hasta ahora");
            arbol = crearArbol(tipo);
            tiposArboles.put(tipo, arbol);
        }
        arboles.add(arbol);
    }

    public void mostrarArboles() {
        for (Arbol a : arboles) {
            System.out.println(a.toString());
        }
    }

    private Arbol crearArbol(String tipo) {
        Arbol arbol = switch (tipo) {
            case "ornamental" -> new Arbol(200, 400, "verde", tipo);
            case "frutal rojo" -> new Arbol(500, 300, "rojo", tipo);
            case "frutal celeste" -> new Arbol(100, 200, "celeste", tipo);
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        };
        return arbol;
    }
}
