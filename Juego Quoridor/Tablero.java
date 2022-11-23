//Alexander Caballero 8-997-2227 || Nahin Mendoza 8-989-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

public class Tablero {
    //Variables para cambiar el color de la ficha
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Declaracion de variables
    String[][] tablero = new String[19][9];

    public void CrearTablero(Jugadores jug1, Jugadores jug2, int[][] muros1) {
        int cont1 = 0, cont2 = 0;
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

                while(cont1 != 20) {
                    //Comprueba que los muros sean verticales
                    if ((muros1[cont1][0] + muros1[cont1+1][0]) % 2 == 0 && muros1[cont1+1][1] - muros1[cont1][1] == 2) {
                        if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    else if ((muros1[cont1+1][0] + muros1[cont1][0]) % 2 == 0 && muros1[cont1+1][1] - muros1[cont1][1] == -2) {
                        if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    
                    //Comprueba que los muros sean horizontales
                    if (muros1[cont1][1] % 2 == 0 && muros1[cont1+1][0] - muros1[cont1][0] == 1) {
                        if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "####";
                        }
                        else if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "####";
                        } //fin if
                    } //fin if
                    else if (muros1[cont1+1][1] % 2 == 0 && muros1[cont1+1][0] - muros1[cont1][0] == -1) {
                        if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "####";
                        }
                        else if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "####";
                        } //fin if
                    }//fin if
                    cont1+= 2;
                }//fin while
                /*while(cont1 != 20) {
                    //Comprueba que los muros sean verticales
                    if ((muros1[cont1][0] + muros1[cont1+1][0]) % 2 == 0 && muros1[cont1+1][1] - muros1[cont1][1] == 2) {
                        if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    else if ((muros1[cont1+1][0] + muros1[cont1][0]) % 2 == 0 && muros1[cont1+1][1] - muros1[cont1][1] == -2) {
                        if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "   #";
                        }
                        else if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "   #";
                        } //fin if
                    } //fin if
                    
                    //Comprueba que los muros sean horizontales
                    if (muros1[cont1][1] % 2 == 0 && muros1[cont1+1][0] - muros1[cont1][0] == 1) {
                        if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "####";
                        }
                        else if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "####";
                        } //fin if
                    } //fin if
                    else if (muros1[cont1+1][1] % 2 == 0 && muros1[cont1+1][0] - muros1[cont1][0] == -1) {
                        if (i == muros1[cont1+1][1] && j == muros1[cont1+1][0]) {
                            tablero[i][j] = "####";
                        }
                        else if (i == muros1[cont1][1] && j == muros1[cont1][0]) {
                            tablero[i][j] = "####";
                        } //fin if
                    }//fin if
                    cont1+= 2;
                }//fin while*/
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
            System.out.print(i);
            for (int j = 0; j < 9; j++) {
                if (i % 2 == 0) {
                    if (j == 0 && i != 0 && i != 18) {
                        System.out.print("  +");
                    }//fin if
                    if ((j == 0 || j == 8) && (i == 0 || i == 18)) {
                        System.out.print(" -");
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
