package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterRemitenteYContenido {
    public List<Mail> remitenteYAsunto(String remitenteP,String contenidoP,List<Mail> lista){
        List<Mail>remitentes=new ArrayList<>();
        Predicate<Mail> remitente= mail->mail.getRemitente().contains(remitenteP);
        Predicate <Mail> contenido= mail->mail.getContenido().contains(contenidoP);
        Predicate<Mail> contenidoYRemitente= remitente.and(contenido);
        remitentes=lista.stream().filter(contenidoYRemitente).collect(Collectors.toList());
        return remitentes;
    }
}