import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.archivadormail.*;

public class TestMailManager {
    @Test
    public void nuevoBuzonYGetBuzones_Test(){
        MailManager mailM=new MailManager();
        mailM.nuevoBuzon("pedro","pedro");
        assertEquals("pedro", mailM.getBuzones().get(0).getName());
    }
    @Test
    public void MandarMailUnaPersona_Test(){
        MailManager mailM=new MailManager();
        mailM.nuevoBuzon("pedro","pedro");
        mailM.nuevoBuzon("pablo", "pablo");
        mailM.MandarMailUnaPersona("hola", "hola", "pedro@gmail.com","pablo@gmail.com");
        assertEquals(1, mailM.getBuzones().get(0).getSalida().getLista().size());
        assertEquals(1, mailM.getBuzones().get(1).getEntrada().getLista().size());
    }
    @Test
    public void MandarMailUnaPersona_Test(){
        MailManager mailM=new MailManager();
        mailM.nuevoBuzon("pedro","pedro");
        mailM.nuevoBuzon("pablo", "pablo");
        mailM.MandarMailUnaPersona("hola", "hola", "pedro@gmail.com","pablo@gmail.com");
        assertEquals(1, mailM.getBuzones().get(0).getSalida().getLista().size());
        assertEquals(1, mailM.getBuzones().get(1).getEntrada().getLista().size());
    }
    
}
