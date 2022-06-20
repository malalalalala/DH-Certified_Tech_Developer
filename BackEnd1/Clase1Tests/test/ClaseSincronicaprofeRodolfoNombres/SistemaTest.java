package ClaseSincronicaprofeRodolfoNombres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema sistema=new Sistema();
@Test
    public void agregar5PersonasTest(){
    //agregar 5 personas
    //nos tiene que dar 2 en cantidad
    PersonaRodo persona1=new PersonaRodo("Juan",25);
    PersonaRodo persona2=new PersonaRodo("Pedro",25);
    PersonaRodo persona3=new PersonaRodo("Ana",25);
    PersonaRodo persona4=new PersonaRodo("Luz",25);
    PersonaRodo persona5=new PersonaRodo("Julian",25);

    sistema.agregarPersonas(persona1);
    sistema.agregarPersonas(persona2);
    sistema.agregarPersonas(persona3);
    sistema.agregarPersonas(persona4);
    sistema.agregarPersonas(persona5);

    assertEquals(2,sistema.cantidadDePersonas());


}

}