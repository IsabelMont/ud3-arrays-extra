package com.IsabelMont;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aleatorio = 0;
        int[] numero;
        numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            Random r = new Random();
            aleatorio = r.nextInt(10);
            numero[i] = aleatorio;


        }
        visualizar(numero);
        ordenar(numero);


    }

    public static void visualizar(int[] numero) {

        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]);

        }
        System.out.println();
    }

    public static void ordenar(int[] numero) {

        for (int i = 2; i < numero.length - 1; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] < numero[j + 1]) {
                    int kk = numero[j + 1];
                    numero[j + 1] = numero[j];
                    numero[j] = kk;
                }

            }


        }
        for (int i = numero.length - 1; i >= 0 ; i--) {
            System.out.print(numero[i]);

        }


    }

}






