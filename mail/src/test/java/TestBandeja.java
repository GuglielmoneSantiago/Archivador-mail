import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.archivadormail.*; 
public class TestBandeja {
    @Test
    public void listaTest_addLista(){
        Bandeja b=new Bandeja();
        Mail m=new Mail("", "", "u", "u");
        b.addLista(m);
        assertNotNull(b.getLista());        
    }
}
