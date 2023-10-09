package com.archivadormail;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    private String fecha;
    private String asunto;
    private String contenido;
    private String remitente;
    private List<String> para= new ArrayList<>();
    public Mail(String asuntoP,String contenidoP,String remitenteP,String paraP){
        if(remitenteP==null||remitenteP.isEmpty()){
            throw new IllegalArgumentException("El remitente no puede estar vacío o ser nulo");
        }
        if(paraP==null||paraP.isEmpty()){
            throw new IllegalArgumentException("El para no puede estar vacío o ser nulo");
        }
        asunto=asuntoP;
        contenido=contenidoP;
        remitente=remitenteP;
        para.add(paraP);
    }
    public String getFecha(){
        return fecha;
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
    public void addPara(String usuario){
        para.add(usuario);;
    }
    public String getPara(){
        String p="";
        for(int i=0;i<para.size();i++){
            p=p+para.get(i)+" ";
            p=p+"\n";
        }
        return p;  
    }
}
