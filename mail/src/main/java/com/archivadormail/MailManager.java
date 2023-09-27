package com.archivadormail;       
import java.util.ArrayList;
public class MailManager {
    
    public void MandarMail(String asuntoP,String contenidoP,Contacto remitenteP,ArrayList<Contacto> lista){
        Mail n=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        salida.lista.add(n);
    }
    public void RecibirMail(String asuntoP,String contenidoP,Contacto remitenteP,Contacto paraP){
        Mail n=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        entrada.lista.add(n);
    }
}
