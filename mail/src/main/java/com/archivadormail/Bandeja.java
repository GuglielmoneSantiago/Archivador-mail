package com.archivadormail;

import java.util.ArrayList;

public class Bandeja {
    ArrayList<Mail> lista;
    public ArrayList<Mail> getLista() {
        return lista;
    }
    public void addLista(Mail m){
        lista.add(m);
    }
}
