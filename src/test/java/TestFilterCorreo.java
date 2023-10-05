import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.archivadormail.Buzon;
import com.archivadormail.FilterCorreo;
import com.archivadormail.MailManager;
public class TestFilterCorreo {
    @Test
    public void filterCorreo_Test(){
        MailManager mailM=new MailManager();
        for(int i=0;i<10;i++){
            String n=i+"";
            mailM.nuevoBuzon(n,n);
        }
        FilterCorreo filtro=new FilterCorreo();
        List<Buzon> j=filtro.nombre("1@gmail.com",mailM.getBuzones());
        assertEquals("1@gmail.com",j.get(0).getEmail());
        assertEquals(1, j.size());
    }
}
