

public class Tablero {
    public static void DibujarTablero(Jugadores jug1, Jugadores jug2) {
        System.out.println(" _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < 9; i++) {
            System.out.print("|");
            for (int j = 0; j < 9; j++) {
                if (i == jug1.getY() && j == jug1.getX()) {
                    System.out.print("x|");
                }
                else if (i == jug2.getY() && j == jug2.getX()) {
                    System.out.print("o|");
                }
                else {
                    System.out.print("_|");
                }//fin if
            }//fin for
            System.out.print("\n");
        }//fin for
    }//fin método DibujarTablero
}//fin class
