import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.archivadormail.Buzon;
import com.archivadormail.FilterRemitente;
import com.archivadormail.FilterRemitenteYAsunto;
import com.archivadormail.Mail;

public class TestFilterRemitenteYAsunto {
    @Test
    public void filterRemitenteYAsunto_Test(){
        Buzon buzon=new Buzon("pablo", "pablo");
        for(int i=0;i<10;i++){
            Mail mail=new Mail(""+i, "a", ""+i, "a");
            buzon.addMailEntrada(mail);
        }
        FilterRemitenteYAsunto filtro=new FilterRemitenteYAsunto();
        List<Mail> j=filtro.remitenteYAsunto("1","1",buzon.getEntrada().getLista());
        assertEquals("1",j.get(0).getRemitente());
        assertEquals("1",j.get(0).getAsunto());
        assertEquals(1, j.size());
    }
}
