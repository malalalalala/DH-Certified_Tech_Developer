package poo.varela;

public class Main {

    public static void main(String[] args) throws Exception {
        Instituto instituto = new Instituto();
        Curso frontend = (Curso) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("curso");
        Curso backend = (Curso) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("curso");
        Curso cursoConMenosDe10hs = (Curso) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("curso");
        Taller designThinking = (Taller) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("taller");
        Taller uxui = (Taller) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("taller");
        ProgramaIntensivo fullstack = (ProgramaIntensivo) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("programa");
        Carrera certifiedTechDeveloper = (Carrera) FabricaDeOfertaAcademica.obtenerInstancia().crearOfertaAcademica("carrera");

        frontend.setNombre("Front End");
        frontend.setDescripcion("Curso introductorio");
        frontend.setValorPorHora(1000);
        frontend.setDuracionEnMeses(2);
        frontend.setCargaHorariaMensual(16);

        backend.setNombre("Back End");
        backend.setDescripcion("Curso introductorio");
        backend.setValorPorHora(900);
        backend.setDuracionEnMeses(2);
        backend.setCargaHorariaMensual(20);

        cursoConMenosDe10hs.setNombre("Curso con menos de 10hs");
        cursoConMenosDe10hs.setDescripcion("Curso con menos de 10hs");
        cursoConMenosDe10hs.setValorPorHora(1200);
        cursoConMenosDe10hs.setDuracionEnMeses(2);
        cursoConMenosDe10hs.setCargaHorariaMensual(5);

        designThinking.setNombre("Design Thinking");
        designThinking.setDescripcion("Curso introductorio");
        designThinking.setPrecioPorTP(500);
        designThinking.setCantidadTPs(5);

        uxui.setNombre("UX / UI");
        uxui.setDescripcion("Curso introductorio");
        uxui.setPrecioPorTP(750);
        uxui.setCantidadTPs(4);

        fullstack.setNombre("FullStack");
        fullstack.setDescripcion("Curso introductorio");
        fullstack.setBonificacion(0.2);

        certifiedTechDeveloper.setNombre("CTD");
        certifiedTechDeveloper.setDescripcion("Curso introductorio");
        certifiedTechDeveloper.setPrecioBase(10000);

        try {
            certifiedTechDeveloper.agregar(designThinking);
            certifiedTechDeveloper.agregar(uxui);
            certifiedTechDeveloper.agregar(frontend);
            certifiedTechDeveloper.agregar(backend);
            // Si descomentan la linea de abajo se lanza la excepcion!
             certifiedTechDeveloper.agregar(cursoConMenosDe10hs);
        } catch (CarreraCargaHorariaCursoException err) {
            System.err.println(err.getMessage());
        }

        fullstack.agregar(frontend);
        fullstack.agregar(backend);

        instituto.agregarOferta(frontend);
        instituto.agregarOferta(backend);
        instituto.agregarOferta(cursoConMenosDe10hs);
        instituto.agregarOferta(designThinking);
        instituto.agregarOferta(uxui);
        instituto.agregarOferta(fullstack);
        instituto.agregarOferta(certifiedTechDeveloper);

        instituto.generarInforme();
    }
}
