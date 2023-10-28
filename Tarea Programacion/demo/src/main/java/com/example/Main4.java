package com.example;
//Pregunta 19
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("Juan"));
        lista.add(new Nombres("Jean"));
        lista.add(new Nombres("Mariana"));

        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, new Nombres("Hola"));
            System.out.println("Lista después de cambiar todos los elementos:" + lista.get(i).getNombre());
        }
    }
}

