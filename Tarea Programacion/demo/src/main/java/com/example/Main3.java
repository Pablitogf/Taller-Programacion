package com.example;
//18
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(10);
        lista.add(15);

        for (Integer number : lista) {
            System.out.println(number);
        }
    }
    
}
