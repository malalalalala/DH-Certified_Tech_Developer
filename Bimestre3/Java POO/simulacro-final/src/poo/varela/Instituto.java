package poo.varela;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertas;

    public Instituto() {
        this.ofertas = new ArrayList<>();
    }

    public void generarInforme() {
        for (OfertaAcademica oferta : ofertas) {
            System.out.println(oferta.toString() + "\n");
        }
    }

    public void agregarOferta(OfertaAcademica oferta) {
        this.ofertas.add(oferta);
    }
}
