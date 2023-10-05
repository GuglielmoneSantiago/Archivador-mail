import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.archivadormail.*;

public class TestBuzon {
    @Test
    public void newBuzon_Test(){
        Buzon buzon=new Buzon("hola","hola");
        assertEquals("hola", buzon.getName());
    }
}
