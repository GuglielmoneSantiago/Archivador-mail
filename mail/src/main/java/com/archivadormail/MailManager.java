package com.archivadormail;       
import java.util.ArrayList;
import java.util.List;
public class MailManager {
    private List<Buzon>buzones=new ArrayList<>();
    public void MandarMailVariasPersonas(String asuntoP,String contenidoP,String remitenteP,ArrayList<String> para){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, para.get(0));
        if(para.size()>1){
            for(int i=1;i<para.size();i++){
                mail.addPara(para.get(i));
            }
        }
        
    }
    
    public void MandarMailUnaPersona(String asuntoP,String contenidoP,String remitenteP,String paraP){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        Filter filtro=new Filter();
        Buzon remitente=filtro.nombre(remitenteP,buzones).get(0);
        remitente.addMailSalida(mail);
        Buzon para=filtro.nombre(paraP,buzones).get(0);
        para.addMailEntrada(mail);
    }
    public void agregarBuzon(Buzon buzonP){
        buzones.add(buzonP);
    }
}
