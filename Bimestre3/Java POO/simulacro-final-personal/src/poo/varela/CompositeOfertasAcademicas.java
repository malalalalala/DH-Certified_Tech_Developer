package poo.varela;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeOfertasAcademicas extends OfertaAcademica {

    private List<OfertaAcademica> cursos;

    public CompositeOfertasAcademicas(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.cursos = new ArrayList<>();
    }

    public void agregar(OfertaAcademica oferta) throws Exception {
        cursos.add(oferta);
    }

    public void eliminar(OfertaAcademica oferta) {
        cursos.remove(oferta);
    }

    public List<OfertaAcademica> getCursos() {
        return cursos;
    }
}
