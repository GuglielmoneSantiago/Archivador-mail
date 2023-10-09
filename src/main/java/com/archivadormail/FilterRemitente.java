package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterRemitente {
    public List<Mail> remitente(String remitenteP,List<Mail> lista){
        List<Mail>remitentes=new ArrayList<>();
        Predicate<Mail> remitente= mail->mail.getRemitente().contains(remitenteP);
        remitentes=lista.stream().filter(remitente).collect(Collectors.toList());
        return remitentes;
    }
}
