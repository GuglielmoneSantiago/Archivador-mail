package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterCorreo {
    public List<Buzon> nombre(String nombreP,List<Buzon> lista){
        List<Buzon>buzones=new ArrayList<>();
        Predicate <Buzon> correo= buzon->buzon.getEmail().contains(nombreP);
        buzones=lista.stream().filter(correo).collect(Collectors.toList());
        return buzones;
    }
}
