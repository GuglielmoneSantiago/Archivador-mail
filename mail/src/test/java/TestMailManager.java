import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
    public void MandarMailVariasPersonas_Test(){
        MailManager mailM=new MailManager();
        mailM.nuevoBuzon("pedro","pedro");
        mailM.nuevoBuzon("pablo", "pablo");
        mailM.nuevoBuzon("jose","jose");
        List<String> lista=new ArrayList<>();
        lista.add(mailM.getBuzones().get(2).getEmail());
        lista.add(mailM.getBuzones().get(1).getEmail());
        mailM.MandarMailVariasPersonas("hola", "hola", "pedro@gmail.com",lista);
        assertEquals(1, mailM.getBuzones().get(0).getSalida().getLista().size());
        assertEquals(1, mailM.getBuzones().get(1).getEntrada().getLista().size());
        assertEquals(1, mailM.getBuzones().get(2).getEntrada().getLista().size());
    }
    
}
