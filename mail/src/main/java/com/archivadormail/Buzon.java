package com.archivadormail;
public class Buzon {
    private Contacto miContacto;
    private Bandeja entrada;
    private Bandeja salida;
    public Buzon(String nameP,String emailP){
        miContacto.setName(nameP);
        miContacto.setEmail(emailP);
    }
    public String getName(){
        return miContacto.getName();
    }
    public String getEmail(){
        return miContacto.getEmail();
    }
    public void addMailEntrada(Mail mailP){
        entrada.lista.add(mailP);
    }
    public void addMailSalida(Mail mailP){
        salida.lista.add(mailP);
    }
}