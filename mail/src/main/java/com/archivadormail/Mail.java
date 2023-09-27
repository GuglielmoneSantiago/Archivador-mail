package com.archivadormail;

import java.util.ArrayList;

public class Mail {
    private String asunto;
    private String contenido;
    private String remitente;
    ArrayList<Contacto> para;
    public Mail(String asuntoP,String contenidoP,Contacto remitenteP,Contacto paraP){
        asunto=asuntoP;
        contenido=contenidoP;
        remitente=remitenteP.getEmail();
        para.add(paraP);
    }
    public String getAsunto(){
        return asunto;
    }
    public String getContenido(){
        return contenido;
    }
    public String getRemitente(){
        return remitente;
    }
    public void addPara(Contacto contacto){
        para.add(contacto);;
    }
    public String getPara(){
        String p="";
        for(int i=0;i<para.size();i++){
            p=p+para.get(i).getEmail()+" ";
            p=p+para.get(i).getName()+"\n";
        }
        return p;  
    }
}
