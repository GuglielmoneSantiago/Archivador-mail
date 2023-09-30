import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.archivadormail.*; 
public class BandejaTest {
    @Test
    public void listaTest(){
        Bandeja b=new Bandeja();
        assertNotNull(b.getLista());        
    }
}
