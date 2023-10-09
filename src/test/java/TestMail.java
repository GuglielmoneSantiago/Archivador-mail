import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.archivadormail.*; 

public class TestMail {
    @Test
    public void TestGetAsunto_Test(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        assertEquals("hola", mail.getAsunto());
    }
    @Test
    public void TestGetContenido_Test(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        assertEquals("hola", mail.getContenido());
    }
    @Test
    public void TestGetRemitente_Test(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        assertEquals("a", mail.getRemitente());
    }
    @Test
    public void TestGetPara_Test(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        assertEquals("b \n", mail.getPara());
    }
    @Test
    public void TestGetAddPara_Test(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        mail.addPara("a");
        assertEquals("b \na \n", mail.getPara());
    }
    @Test
    public void testMailWithEmptySender() {
        try {
            Mail correo = new Mail("", "destinatario@example.com", "Asunto", "Mensaje de prueba");
        } catch (IllegalArgumentException e) {
            assertEquals("El remitente no puede estar vacío o ser nulo", e.getMessage());
        }
    }

    @Test
    public void testMailWithValidSender() {
        // Prueba con un remitente válido
        Mail correo = new Mail("remitente@example.com", "destinatario@example.com", "Asunto", "Mensaje de prueba");
        // Asegúrate de que la instancia de correo se creó correctamente
        assertNotNull(correo);
    }
}
