package com.archivadormail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNombre {
    public List<Buzon> nombre(String nombreP,List<Buzon> lista){
        List<Buzon>n=new ArrayList<>();
        Predicate <Buzon> nombre= buzon->buzon.getEmail().contains(nombreP);
        n=lista.stream().filter(nombre).collect(Collectors.toList());
        return n;
    }
}
