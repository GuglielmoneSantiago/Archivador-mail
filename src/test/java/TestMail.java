import static org.junit.Assert.assertEquals;


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
}
