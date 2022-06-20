package ClaseAsincronicaAnimales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void siElAnimalEsPesado(){
        Animal caballo=new Animal("caballo","grande",5000);
        Animal perro=new Animal("perro","mediano",20);

        boolean esPesadoCaballo= caballo.esPesado();
        boolean esPesadoPerro= perro.esPesado();

        assertTrue(esPesadoCaballo);
        assertFalse(esPesadoPerro);
       }



}