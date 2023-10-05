import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.archivadormail.Contacto;

public class TestContacto {
    @Test
    public void getName_Test(){
        Contacto contacto=new Contacto("juan", "juan");
        assertEquals("juan", contacto.getName());
    }
    @Test
    public void getEmail_Test(){
        Contacto contacto=new Contacto("juan", "juan");
        assertEquals("juan@gmail.com", contacto.getEmail());
    }
}
