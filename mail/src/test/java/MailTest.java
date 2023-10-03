import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.archivadormail.*; 

public class MailTest {
    @Test
    public void TestGetAsunto_TrueTest(){
        Mail mail=new Mail("hola", "hola", "a", "b");
        assertEquals("hola", mail.getAsunto());
    }
}
