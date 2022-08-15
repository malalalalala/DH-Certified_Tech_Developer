package MesasDeTrabajoÁrboles;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    public static final Map<String, Arbol> arbolMap = new HashMap<>();


    public Arbol crearArbol(final String tipo) {
        Arbol arbol = arbolMap.get(tipo);
        if (arbol == null) {
            arbol = new Arbol(tipo);
            switch (tipo) {
                case "Ornamental" -> {
                    arbol.setAncho(200);
                    arbol.setAlto(400);
                    arbol.setColor("Verde");
                    arbolMap.put(tipo, arbol);
                    System.out.println("árbol Ornamental creado");
                    return arbol;
                }
                case "Frutal" -> {
                    arbol.setAncho(500);
                    arbol.setAlto(300);
                    arbol.setColor("Rojo");
                    arbolMap.put(tipo, arbol);
                    System.out.println("árbol Frutal creado");
                    return arbol;
                }
                case "Floral" -> {
                    arbol.setAncho(100);
                    arbol.setAlto(200);
                    arbol.setColor("Celeste");
                    arbolMap.put(tipo, arbol);
                    System.out.println("árbol Floral creado");
                    return arbol;
                }
                default ->
                    System.out.println("árbol no existe");
            }

        }
        System.out.println("el árbol" +arbol +"ya estaba creado");
        return arbol;
    }
}