package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] tablero = new String[8][8];
        //fichas
        String reinanegra = "\u265B";
        String reinablanca = "\u2655";
        String torrenegra = "\u265c";
        String torreblanca = "\u2656";
        String alfilnegro = "\u265d";
        String alfilblanco = "\u2657";
        String caballonegro = "\u265e";
        String caballoblanco = "\u2658";
        String reynegro = "\u265a";
        String reyblanco = "\u2654";
        String peonnegro = "\u265f";
        String peonblanco = "\u2659";

        tablero[0][0] = torrenegra;
        tablero[0][1] = caballonegro;
        tablero[0][2] = alfilnegro;
        tablero[0][3] = reynegro;
        tablero[0][4] = reinanegra;
        tablero[0][5] = alfilnegro;
        tablero[0][6] = caballonegro;
        tablero[0][7] = torrenegra;
        tablero[1][0] = peonnegro;
        tablero[1][1] = peonnegro;
        tablero[1][2] = peonnegro;
        tablero[1][3] = peonnegro;
        tablero[1][4] = peonnegro;
        tablero[1][5] = peonnegro;
        tablero[1][6] = peonnegro;
        tablero[1][7] = peonnegro;
        tablero[7][0] = torreblanca;
        tablero[7][1] = caballoblanco;
        tablero[7][2] = alfilblanco;
        tablero[7][3] = reyblanco;
        tablero[7][4] = reinablanca;
        tablero[7][5] = alfilblanco;
        tablero[7][6] = caballoblanco;
        tablero[7][7] = torreblanca;
        tablero[6][0] = peonblanco;
        tablero[6][1] = peonblanco;
        tablero[6][2] = peonblanco;
        tablero[6][3] = peonblanco;
        tablero[6][4] = peonblanco;
        tablero[6][5] = peonblanco;
        tablero[6][6] = peonblanco;
        tablero[6][7] = peonblanco;

        //turnos
        int turnoblancas = 0;
        int turnonegras = 1;

        Random r = new Random();
        int aleatorio = r.nextInt(2);
        if (turnoblancas == aleatorio)

            System.out.println("¡EMPIEZAN LAS BLANCAS!");
        else System.out.println("¡EMPIEZAN LAS NEGRAS!");
        visulizarTablero(tablero);


            if (turnoblancas == aleatorio)
                System.out.println("MUEVEN LAS BLANCAS");
            else System.out.println("MUEVEN LAS NEGRAS");

            System.out.println("¿A que fila lo quieres mover?");
            int fila = Integer.parseInt(br.readLine());
            System.out.println("¿A que columna lo quieres mover ?");
            int columna = Integer.parseInt(br.readLine());
            System.out.println("¿Que ficha quieres mover?¿DAMA, TORRE, PEON, ALFIL, REY O CABALLO?");
            String respuesta = br.readLine();
            if (respuesta.charAt(0) == 'd') {

            }


        }



    public static void visulizarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    tablero[i][j] = "0 ";
                }
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

}
