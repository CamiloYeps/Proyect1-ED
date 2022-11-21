public class Tablero {
    //Variables para cambiar el color de la ficha
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Método para crear el tablero del juego
    public static void CrearTablero(Jugadores jug1, Jugadores jug2, int x1, int y1, int x2, int y2) {
        System.out.println(" -------------------------------------");
        while (true) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(" |");
                for (int j = 1; j <= 9; j++) {
                    if (i == jug1.getY1() && j == jug1.getX1()) {
                        System.out.print(ANSI_RED + " o " + ANSI_RESET + "|");
                    }
                    else if (i == jug2.getY2() && j == jug2.getX2()) {
                        System.out.print(" o |");
                    }
                    else if (y2 - y1 == 1) {
                        if (i == y1 && j == x1) {
                            System.out.print("   #");
                        }
                        else if (i == y2 && j == x2) {
                            System.out.print("   #");
                        }
                        else {
                            System.out.print("   |");
                        }//fin if
                    }
                    else {
                        System.out.print("   |");
                    }//fin if
                } //fin for
                if (i != 9) {
                    
                    System.out.print("\n" + i + "+---+");
                    for (int k = 1; k <= 8; k++) {
                        if (x2 - x1 == 1) {
                            if (i == y1 && k == x1) {
                                System.out.print("####");
                            } 
                            else if (i == y2 && k == x2) {
                                System.out.print("####");
                            } 
                            else {
                                System.out.print("---+");
                            } //fin if
                        }
                        else {
                            System.out.print("---+");
                        }//fin if
                    }//fin for
                }//fin if
                System.out.print("\n");
            } //fin for
            System.out.println(" -------------------------------------");
            break;
        }//fin while
      System.out.println("     1   2   3   4   5   6   7   8");
    }//fin método CrearTablero

    /*//Método para mover las fichas en el tablero
    public static void MoverFichasTablero(Jugadores jug1, Jugadores jug2) {
        System.out.println(" -------------------------------------");
        while (true) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "|");
                for (int j = 1; j <= 9; j++) {
                    if (i == jug1.getY1() && j == jug1.getX1()) {
                        System.out.print(ANSI_RED + " o " + ANSI_RESET + "|");
                    }
                    else if (i == jug2.getY2() && j == jug2.getX2()) {
                        System.out.print(" o |");
                    }
                    else {
                        System.out.print("   |");
                    }//fin if
                } //fin for
                if (i != 9) {
                    System.out.print("\n +---+");
                    for (int k = 1; k <= 8; k++) {
                        System.out.print("---+");
                    }//fin for
                }//fin if
                System.out.print("\n");
            } //fin for
            System.out.println(" -------------------------------------");
            break;
        }//fin while
      System.out.println("   1   2   3   4   5   6   7   8   9");
    }//fin método CrearTablero */
}//fin class
