import java.io.*;

public class Quoridor {
    public static void main(String[] args) throws IOException {
        //Crear objetos
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Jugadores jug1 = new Jugadores(0, 4);
        Jugadores jug2 = new Jugadores(8, 4);
        //Declaracion de variables
        int opc, cont = 0, coordenadaX, coordenadaY;
        boolean isGameOver = true;
        String nombre;

        //Imprimir el tablero Quoridor
        Tablero.DibujarTablero(jug1, jug2);
        System.out.println("\n");
        
        while (isGameOver) {
            System.out.println("1. Mover ficha");
            System.out.println("2. Poner muro");
            System.out.print("Elija su opcion: ");
            opc = Integer.parseInt(bufer.readLine());
            
            switch (opc) {
                case 1:
                    cont++;
                    if ((cont % 2) == 1) {
                        nombre = "jugador 1";
                        System.out.println("Turno del " + nombre);

                        System.out.println("Digite las coordenas en donde quiere que se mueva la ficha: ");
                        System.out.println("Digite la coordenada y: ");
                        coordenadaY = Integer.parseInt(bufer.readLine());

                        System.out.println("Digite la coordenada x: ");
                        coordenadaX = Integer.parseInt(bufer.readLine());

                        jug1.MoverFichaJugador1(coordenadaY, coordenadaX);

                        Tablero.DibujarTablero(jug1, jug2);

                        //Verificar si gano la partida
                        if (coordenadaY == 8) {
                            System.out.println("El ganador es: " + nombre);
                            isGameOver = false;
                        }//fin if
                    }
                    else if ((cont % 2) == 0) {
                        nombre = "jugador 2";
                        System.out.println("Turno del " + nombre);

                        System.out.println("Digite las coordenas en donde quiere que se mueva la ficha: ");
                        System.out.println("Digite la coordenada y: ");
                        coordenadaY = Integer.parseInt(bufer.readLine());

                        System.out.println("Digite la coordenada x: ");
                        coordenadaX = Integer.parseInt(bufer.readLine());

                        jug2.MoverFichaJugador2(coordenadaY, coordenadaX);

                        Tablero.DibujarTablero(jug1, jug2);

                        //Verificar si gano la partida
                        if (coordenadaY == 0) {
                            System.out.println("El ganador es: " + nombre);
                            isGameOver = false;
                        }//fin if
                    }//fin if
                    break;
                case 2:
                    System.out.println("");
                    break;
                default:
                    System.out.println("ERROR: opcion invalida");
                    break;
            }//fin switch case
        }//fin while
    }//fin main
}//fin class
