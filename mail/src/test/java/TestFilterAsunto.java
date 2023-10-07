import com.archivadormail.FilterNombre;
import com.archivadormail.*;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestFilterAsunto {
    @Test
    public void filterAsunto_Test(){
        Buzon buzon=new Buzon("pablo", "pablo");
        for(int i=0;i<10;i++){
            Mail mail=new Mail(""+i, "", "", "");
            buzon.addMailEntrada(mail);
        }
        FilterAsunto filtro=new FilterAsunto();
        List<Mail> j=filtro.asunto("1",buzon.getEntrada().getLista());
        assertEquals("1",j.get(0).getAsunto());
        assertEquals(1, j.size());
    }
}