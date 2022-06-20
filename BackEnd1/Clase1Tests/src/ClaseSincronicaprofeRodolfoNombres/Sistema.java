package ClaseSincronicaprofeRodolfoNombres;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<PersonaRodo> personas;

    public Sistema(){
        personas=new ArrayList<>();
    }

    public void agregarPersonas(PersonaRodo persona){
        //agregamos solo si es mayo de edad y tiene 5 letras o más el nombre
        if (persona.esMayorDeEddad()&&persona.esNombreMayorIgual5Letras()) personas.add(persona);
        else{
            System.out.println("No se puede agregar a " +persona.getNombre());
        }
    }

    public int cantidadDePersonas(){
        return personas.size();
    }
}
