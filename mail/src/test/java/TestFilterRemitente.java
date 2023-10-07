import static org.junit.Assert.assertEquals;

import java.io.FilterReader;
import java.util.List;

import org.junit.Test;

import com.archivadormail.Buzon;
import com.archivadormail.FilterAsunto;
import com.archivadormail.FilterRemitente;
import com.archivadormail.Mail;

public class TestFilterRemitente {
    @Test
    public void filterRemitente_Test(){
        Buzon buzon=new Buzon("pablo", "pablo");
        for(int i=0;i<10;i++){
            Mail mail=new Mail("", "", ""+i, "");
            buzon.addMailEntrada(mail);
        }
        FilterRemitente filtro=new FilterRemitente();
        List<Mail> j=filtro.remitente("1",buzon.getEntrada().getLista());
        assertEquals("1",j.get(0).getRemitente());
        assertEquals(1, j.size());
    }
}
