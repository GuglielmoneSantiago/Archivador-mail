import com.archivadormail.FilterNombre;
import com.archivadormail.*;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestFilterContenido {
    @Test
    public void filterContenido_Test(){
        Buzon buzon=new Buzon("pablo", "pablo");
        for(int i=0;i<10;i++){
            Mail mail=new Mail("a", ""+i, "a", "a");
            buzon.addMailEntrada(mail);
        }
        FilterContenido filtro=new FilterContenido();
        List<Mail> j=filtro.contenido("1",buzon.getEntrada().getLista());
        assertEquals("1",j.get(0).getContenido());
        assertEquals(1, j.size());
    }
}