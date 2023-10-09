package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterContenido {
    public List<Mail> contenido(String contenidoP,List<Mail>mails){
        List<Mail> lista=new ArrayList<>();
        Predicate <Mail> contenido= mail->mail.getContenido().contains(contenidoP);
        lista=mails.stream().filter(contenido).collect(Collectors.toList());
        return lista;
    }
}