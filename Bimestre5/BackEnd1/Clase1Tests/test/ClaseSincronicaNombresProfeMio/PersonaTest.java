package ClaseSincronicaNombresProfeMio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonaTest {
   @Test
    public void probarMayorEdad(){
        //Se crean las personas a probar
        Persona persona1= new Persona("Facu", 11);
        Persona persona2= new Persona("Roque", 42);

        //CUANDO / ENTONCES
        Assertions.assertTrue(persona2.esMayorDeEdad());
        //Assert.assertEquals(true,persona2.esMayorDeEdad());
        Assertions.assertFalse(persona1.esMayorDeEdad());
        //Assert.assertEquals(false,persona1.esMayorDeEdad());

}
}