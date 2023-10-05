import com.archivadormail.FilterNombre;
import com.archivadormail.*;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestFilterNombre {
    @Test
    public void filterNombre_Test(){
        MailManager mailM=new MailManager();
        for(int i=0;i<10;i++){
            String n=i+"";
            mailM.nuevoBuzon(n,n);
        }
        FilterNombre filtro=new FilterNombre();
        List<Buzon> j=filtro.nombre("1",mailM.getBuzones());
        assertEquals("1",j.get(0).getName());
        assertEquals(1, j.size());
    }
}
