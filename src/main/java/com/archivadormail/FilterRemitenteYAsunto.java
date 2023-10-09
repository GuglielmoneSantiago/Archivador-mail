package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterRemitenteYAsunto {
    public List<Mail> remitenteYAsunto(String remitenteP,String asuntoP,List<Mail> lista){
        List<Mail>remitentes=new ArrayList<>();
        Predicate<Mail> remitente= mail->mail.getRemitente().contains(remitenteP);
        Predicate <Mail> asunto= mail->mail.getAsunto().contains(asuntoP);
        Predicate<Mail> asuntoYRemitente= remitente.and(asunto);
        remitentes=lista.stream().filter(asuntoYRemitente).collect(Collectors.toList());
        return remitentes;
    }
}
