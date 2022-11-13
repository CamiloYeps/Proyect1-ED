

public class Tablero {
   public static void CrearTablero() {
        System.out.println("  _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 4) {
                    System.out.print("o|");
                }
                else if (i == 8 && j == 4) {
                    System.out.print("x|");
                }
                else {
                    System.out.print("_|");
                }//fin if
            }//fin for
            System.out.print("\n");
        } //fin for
        System.out.println("  0 1 2 3 4 5 6 7 8");
    }//fin método DibujarTablero

    /*public static void DibujarTablero() {
        System.out.println(" _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < 9; i++) {
            System.out.print("|");
            for (int j = 0; j < 9; j++) {
                if (i == jug1.getY() && j == jug1.getX()) {
                    System.out.print("o|");
                }
                else if (i == jug2.getY() && j == jug2.getX()) {
                    System.out.print("x|");
                }
                else {
                    System.out.print("_|");
                }//fin if
            }//fin for
            System.out.print("\n");
        }//fin for
    }//fin metodo CrearTablero*/

    public static void RegistrarMovimientos() {
        
    }//fin metodo RegistrarMovimientos
}//fin class
