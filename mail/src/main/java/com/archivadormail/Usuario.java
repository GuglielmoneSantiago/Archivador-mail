package com.archivadormail;
import java.util.ArrayList;
public class Usuario {
    private Contacto miContacto;
    private Bandeja entrada;
    private Bandeja salida;
    private ArrayList<Contacto> lista;
    public Usuario(String nameP,String emailP){
        contactoUs.setName(nameP);
        contactoUs.setEmail(emailP);
    }
    public String getName(){
        return contactoUs.getName();
    }
    public String getEmail(){
        return contactoUs.getEmail();
    }
}
