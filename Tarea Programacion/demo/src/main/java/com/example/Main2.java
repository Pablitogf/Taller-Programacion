
package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Ejercicio 15
public class Main2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Julian");
        lista.add("Pablo");
        lista.add("Dana");
        lista.add("Robert");
        lista.add("Santi");

    Collections.sort(lista);

    System.out.println("Nombres ordenados alfabeticamente:");
    for (String nombre : lista) {
        System.out.println(nombre);
    }
    }

    
}
