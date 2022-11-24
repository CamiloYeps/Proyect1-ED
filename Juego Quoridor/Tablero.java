//Alexander Caballero 8-997-2227 || Nahin Mendoza 8-989-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.util.ArrayList;

public class Tablero {
    //Variables para cambiar el color de la ficha
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Declaracion de variables
    String[][] tablero = new String[19][9];

    public void CrearTablero(Jugadores jug1, Jugadores jug2, ArrayList <Integer> muros1, ArrayList <Integer> muros2) {
        int c = 0;
        int f = 0;

        //Cargar el tablero
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 18) {
                    tablero[i][j] = "----";
                }
                else if (i % 2 == 1) {
                    tablero[i][j] = "   |";
                } //fin if
                else {
                    tablero[i][j] = "---+";
                } //fin if

                //Guardar posición de los jugadores
                if (i == jug1.getY1() && j == jug1.getX1()) {
                    tablero[i][j] = (ANSI_RED + " o " + ANSI_RESET + "|");
                }
                else if (i == jug2.getY2() && j == jug2.getX2()) {
                    tablero[i][j] = (" o |");
                } //fin if
                
                //Comprueba que los muros sean verticales
                while (c != muros1.size()) {
                    if ((muros1.get(c) + muros1.get(c+2)) % 2 == 0 && muros1.get(c+(4-1)) - muros1.get(c+1) == 2) {
                        if (i == muros1.get(c+1) && j == muros1.get(c)) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1.get(c+(4-1)) && j == muros1.get(c+2)) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    else if ((muros1.get(c+2) + muros1.get(c)) % 2 == 0 && muros1.get(c+(4-1)) - muros1.get(c+1) == -2) {
                        if (i == muros1.get(c+(4-1)) && j == muros1.get(c+2)) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1.get(c+1) && j == muros1.get(c)) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    c += 4;
                }//fin while
            }//fin for
        } //fin for

        System.out.println("\n");
    }//fin método

    public void MostrarTablero(String[][] tablero) {

        //variables a usar
        String[][] board = new String[19][9];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = tablero[i][j];
            }
        }
        //Imprimir el tablero
        for (int i = 0; i < 19; i++) {
            if (i != 0 && i != 18) {
                System.out.print(i);
            }//fin if
            for (int j = 0; j < 9; j++) {
                if (i % 2 == 0) {
                    if (j == 0 && i != 0 && i != 18) {
                        System.out.print("  +");
                    }//fin if
                    if ((i == 0 || i == 18) && j == 0) {
                        System.out.print("    -");
                    } //fin if
                    System.out.print(board[i][j]);
                }
                else if (i % 2 == 1) {
                    if (j == 0) {
                        System.out.print("  |");
                    } //fin if
                    System.out.print(board[i][j]);
                } //fin if
            } //fin for
            System.out.print("\n");
            
        } //fin for
        System.out.println("      0   1   2   3   4   5   6   7   8");
    }//fin método
}//fin class
