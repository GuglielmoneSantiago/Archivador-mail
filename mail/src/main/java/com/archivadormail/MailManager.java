package com.archivadormail;       
import java.util.ArrayList;
public class MailManager {
    
    public void MandarMailVariasPersonas(String asuntoP,String contenidoP,Usuario remitenteP,ArrayList<Usuario> para){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, para.get(0));
        if(para.size()>1){
            for(int i=1;i<para.size();i++){
                mail.addPara(para.get(i));
            }
        }
        remitenteP.addMailSalida(mail);
        for(int i=0;i<para.size();i++){
            para.get(i).addMailEntrada(mail);
        }
    }
    public void MandarMailUnaPersona(String asuntoP,String contenidoP,Usuario remitenteP,Usuario para){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, para);
        remitenteP.addMailSalida(mail);
        para.addMailEntrada(mail);
        
    }
}
