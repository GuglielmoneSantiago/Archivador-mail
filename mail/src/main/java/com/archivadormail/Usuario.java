package com.archivadormail;

public class Usuario {
    private String name;
    private String email;
    public Usuario(String nameP,String emailP){
        name=nameP;
        email=emailP;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
