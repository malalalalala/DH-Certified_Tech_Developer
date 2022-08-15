package ClaseSincrónicaRodoMensajeriaColmena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    public void debeResponderSpam(){
        CompruebaMail comprobador=new CompruebaMail();
        Mail correo=new Mail("dsfg@gmai.col","hsadh","Queja");
        String resEsperada="Mandando a spam";
        String resActual= comprobador.iniciarComprobacion(correo);
        assertEquals(resEsperada,resActual);
    }
    @Test
    public void debeResponderTecnica(){
        CompruebaMail comprobador=new CompruebaMail();
        Mail correo=new Mail("jdhs","tecnica@colmena.com","Queja");
        String resEsperada="Enviado a técnica";
        String resActual= comprobador.iniciarComprobacion(correo);
        assertEquals(resEsperada,resActual);
    }


}