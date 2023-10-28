package com.example;

import java.util.ArrayList;
//Pregunta 2,8,20
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Lista = new ArrayList<>();

    
        Lista.add(new ArrayList<>());
        Lista.add(new ArrayList<>());
        Lista.add(new ArrayList<>());

       
        for (ArrayList<Integer> Array : Lista) {
            if (Array.isEmpty()) {
                System.out.println("Esta vacia");
            } else {
                System.out.println("No esta vacia");
            }
        }
    }
}