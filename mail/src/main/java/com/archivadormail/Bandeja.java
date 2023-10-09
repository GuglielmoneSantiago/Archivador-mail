package com.archivadormail;

import java.util.ArrayList;
import java.util.List;

public class Bandeja {
    private List<Mail> lista=new ArrayList<>();
    public List<Mail> getLista() {
        return lista;
    }
    public void addLista(Mail m){
        lista.add(m);
    }
}
