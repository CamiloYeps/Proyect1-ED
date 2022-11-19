import java.io.*;

public class Quoridor {
    public static void main(String[] args) throws IOException {
        //Crear objetos
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Variables objvar = new Variables();
        Jugadores jug1 = new Jugadores();
        Jugadores jug2 = new Jugadores();

        //Declaracion de variables
        int cont = 0;
        boolean gameover = true;
        String opc;
        
        //Imprimir el tablero Quoridor
        Tablero.CrearTablero(jug1, jug2);
        System.out.println("\n");
        
        while (gameover) {
            try {
                cont++;
                if ((cont % 2) == 1) {
                    System.out.println("Turno del " + objvar.jugador1);
                }
                else {
                    System.out.println("Turno del " + objvar.jugador2);
                }//fin if
                System.out.println("1. Mover ficha");
                System.out.println("2. Poner muro");
                System.out.println("EXIT para retirarse");
                System.out.print("Elija su opcion: ");
                opc = reader.readLine();

                //Compara si los jugadores ha introducido EXIT
                if (opc.equalsIgnoreCase("EXIT") && objvar.jugador1.equals("jugador 1")) {
                    System.out.println("El ganador es el " + objvar.jugador2);
                    gameover = false;
                }
                else if (opc.equalsIgnoreCase("EXIT") && objvar.jugador1.equals("jugador 2")){
                    System.out.println("El ganador es el " + objvar.jugador1);
                    gameover = false;
                }//fin if

                switch (opc) {
                    case "1":
                        if ((cont % 2) == 1) {
                            System.out.println("\nTURNO DEL JUGADOR 1");
                            System.out.println("1. Mover hacia arriba");
                            System.out.println("2. Mover hacia izquierda");
                            System.out.println("3. Mover hacia derecha");
                            System.out.println("4. Mover hacia abajo");

                            opc = reader.readLine();
                            jug1.MoverFichaJugador1(opc);
                            Tablero.CrearTablero(jug1,jug2);
                        }
                        else {
                            System.out.println("\nTURNO DEL JUGADOR 2");
                            System.out.println("1. Mover hacia arriba");
                            System.out.println("2. Mover hacia izquierda");
                            System.out.println("3. Mover hacia derecha");
                            System.out.println("4. Mover hacia abajo");

                            opc = reader.readLine();
                            jug2.MoverFichaJugador2(opc);
                            Tablero.CrearTablero(jug1,jug2);
                        }//fin if
                        break;
                
                    default:
                        break;
                }//fin switch case
            } catch (Exception e) {
                cont--;
                System.out.println("Ha insertado una opcion incorrecta");
                gameover = true;
            }//fin try-catch
        }//fin while
    }//fin main
}//fin class
