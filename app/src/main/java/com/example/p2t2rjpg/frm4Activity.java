package com.example.p2t2rjpg;

import java.util.ArrayList;
public class frm4Activity {
    public static ArrayList<String> listaColores=new ArrayList<String>();
    public static void agregar(String name){
        listaColores.add(name);
    }
    public static ArrayList<String>mostrar(){
        return listaColores;
    }
}
