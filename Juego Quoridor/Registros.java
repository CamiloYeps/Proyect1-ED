//Alexander Caballero 8-997-2227 || Nahin Mendoza 8-989-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

public class Registros {

    //Función para guardar las posiciones del jugador1
    public static void RegistrarJugador1(Jugadores jug1, int cont, String palabra) {
        //Declaración de variables
        int[][] registrarrecorrido1 = new int[1000][2];

        //Mostrar el recorrido del jugador1
        if (palabra.equalsIgnoreCase("EXIT")) {
            System.out.println("x, y");

            //Mostrar el recorrido del jugador1
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(registrarrecorrido1[cont][j] + ", ");
                } //fin for
                System.out.print("\n");
            }//fin for
        }
        else {
            registrarrecorrido1[cont][0] = jug1.getX1();
            registrarrecorrido1[cont][1] = jug1.getY1();
        }
    }//fin método

    //Función para guardar las posiciones del jugador2
    public static void RegistrarJugador2(Jugadores jug2, int cont, String palabra) {
        //Declaración de variables
        int[][] registrarrecorrido2 = new int[1000][2];

        //Mostrar el recorrido del jugador2
        if (palabra.equalsIgnoreCase("EXIT")) {
            System.out.println("x, y");

            //Mostrar el recorrido del jugador1
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(registrarrecorrido2[cont][j] + ", ");
                } //fin for
                System.out.print("\n");
            } //fin for
        }
        //Guard
        else {
            registrarrecorrido2[cont][0] = jug2.getX2();
            registrarrecorrido2[cont][1] = jug2.getY2();
        }
    }//fin método
}//fin class
