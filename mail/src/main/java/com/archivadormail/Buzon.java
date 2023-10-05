package com.archivadormail;
public class Buzon{
    private Contacto miContacto=new Contacto("", "");
    private Bandeja entrada=new Bandeja();
    private Bandeja salida=new Bandeja();
    public Buzon(String nameP,String emailP){
        miContacto.setName(nameP);
        miContacto.setEmail(emailP+"@gmail.com");
    }
    public String getName(){
        return miContacto.getName();
    }
    public String getEmail(){
        return miContacto.getEmail();
    }
    public Bandeja getEntrada(){
        return entrada;
    } 
    public Bandeja getSalida(){
        return salida;
    }
    public void addMailEntrada(Mail mailP){
        entrada.lista.add(mailP);
    }
    public void addMailSalida(Mail mailP){
        salida.lista.add(mailP);
    }
}
