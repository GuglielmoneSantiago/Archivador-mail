package com.archivadormail;

import java.util.ArrayList;

public class Bandeja {
    ArrayList<Mail> BandejaSalida;
    ArrayList<Mail> BandejaEntrada;
    private Mail mailActivo;
    public void MandarMail(String asuntoP,String contenidoP,Contacto remitenteP,Contacto paraP){
        Mail n=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        BandejaSalida.add(n);
    }
    public void RecibirMail(String asuntoP,String contenidoP,Contacto remitenteP,Contacto paraP){
        Mail n=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        BandejaEntrada.add(n);
    }
    public void setMailActivo(){
        
    }
}
