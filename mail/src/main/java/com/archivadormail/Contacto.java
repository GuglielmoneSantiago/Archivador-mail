package com.archivadormail;

public class Contacto {
    private String name;
    private String email;
    public Contacto(String nameP,String emailP){
        name=nameP;
        email=emailP;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String nameP){
        name=nameP;
    }
    public void setEmail(String emailP){
        email=emailP;
    }
}
