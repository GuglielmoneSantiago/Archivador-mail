package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterAsunto {
    public List<Mail> asunto(String asuntoP,List<Mail>mails){
        List<Mail> lista=new ArrayList<>();
        Predicate <Mail> asunto= mail->mail.getAsunto().contains(asuntoP);
        lista=mails.stream().filter(asunto).collect(Collectors.toList());
        return lista;
    }
}