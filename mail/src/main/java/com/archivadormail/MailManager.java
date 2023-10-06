package com.archivadormail;       
import java.util.ArrayList;
import java.util.List;
public class MailManager {
    private List<Buzon>buzones=new ArrayList<>();
    public void MandarMailVariasPersonas(String asuntoP,String contenidoP,String remitenteP,ArrayList<String> paraP){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, paraP.get(0));
        if(paraP.size()>1){
            for(int i=1;i<paraP.size();i++){
                mail.addPara(paraP.get(i));
            }
        }
        FilterCorreo filtroRemitente=new FilterCorreo();
        Buzon remitente=filtroRemitente.nombre(remitenteP,buzones).get(0);
        remitente.addMailSalida(mail);
        for(int i=0;i<paraP.size();i++){
            FilterCorreo filtroPara=new FilterCorreo();
            Buzon para=filtroPara.nombre(paraP.get(i),buzones).get(0);
            para.addMailEntrada(mail);
        }
        
    }
    public void MandarMailUnaPersona(String asuntoP,String contenidoP,String remitenteP,String paraP){
        Mail mail=new Mail(asuntoP, contenidoP, remitenteP, paraP);
        FilterCorreo filtroRemitente=new FilterCorreo();
        Buzon remitente=filtroRemitente.nombre(remitenteP,buzones).get(0);
        remitente.addMailSalida(mail);
        FilterCorreo filtroPara=new FilterCorreo();
        Buzon para=filtroPara.nombre(paraP,buzones).get(0);
        para.addMailEntrada(mail);
    }
    public List<Buzon> getBuzones(){
        return buzones;
    }
    public void nuevoBuzon(String nombreP,String emailP){
        Buzon n=new Buzon(nombreP, emailP);
        buzones.add(n);
    }
}
