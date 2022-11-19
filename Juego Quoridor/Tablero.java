public class Tablero {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CrearTablero(Jugadores jug1, Jugadores jug2) {
        System.out.println(" -------------------------------------");
        while (true) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "|");
                for (int j = 1; j <= 9; j++) {
                    if (i == jug2.getY2() && j == jug2.getX2()) {
                        System.out.print(" o |");
                    }
                    else if (i == jug1.getY1() && j == jug1.getX1()) {
                        System.out.print(ANSI_RED + " o " + ANSI_RESET + "|");
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
    }//fin método CrearTablero

    /*public static void CrearTablero() {
        System.out.println(" _____________________________________");
        while (true) {
            for (int i = 0; i < 9; i++) {
                System.out.print(i + "|");
                for (int j = 0; j < 9; j++) {
                    if (i == 0 && j == 4) {
                        System.out.print(" o |");
                    }
                    else if (i == 8 && j == 4) {
                        System.out.print(ANSI_RED + " o " + ANSI_RESET + "|");
                    }
                    else {
                        System.out.print("   |");
                    }//fin if
                } //fin for
                System.out.print("\n +---+");
                for (int k = 0; k < 8; k++) {
                    System.out.print("---+");
                } //fin for
                System.out.print("\n");
            }//fin for
            break;
        }//fin while
      System.out.println("   0   1   2   3   4   5   6   7   8");
    }//fin método DibujarTablero */
}//fin class
