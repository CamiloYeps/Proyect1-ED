public class Tablero {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CrearTablero() {
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
    }//fin método DibujarTablero

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
