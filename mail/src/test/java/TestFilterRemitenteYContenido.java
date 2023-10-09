import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.archivadormail.Buzon;
import com.archivadormail.FilterRemitenteYAsunto;
import com.archivadormail.FilterRemitenteYContenido;
import com.archivadormail.Mail;

public class TestFilterRemitenteYContenido {
    @Test
    public void filterRemitenteYContenido_Test(){
        Buzon buzon=new Buzon("pablo", "pablo");
        for(int i=0;i<10;i++){
            Mail mail=new Mail("a", ""+i, ""+i, "a");
            buzon.addMailEntrada(mail);
        }
        FilterRemitenteYContenido filtro=new FilterRemitenteYContenido();
        List<Mail> j=filtro.remitenteYAsunto("1","1",buzon.getEntrada().getLista());
        assertEquals("1",j.get(0).getRemitente());
        assertEquals("1",j.get(0).getContenido());
        assertEquals(1, j.size());
    }
}
