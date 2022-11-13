import java.io.*;
import java.util.ArrayList;

public class Quoridor {
    public static void main(String[] args) throws IOException {
        //Crear objetos
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Declaracion de variables
        int cont = 0, coordenadaX, coordenadaY;
        boolean gameover = true;
        String nombre, opc;
        ArrayList <ArrayList <Integer> > moveregisters1 = new ArrayList <ArrayList <Integer> >();
        ArrayList <ArrayList <Integer> > moveregisters2 = new ArrayList <ArrayList <Integer> >();
        
        //Imprimir el tablero Quoridor
        Tablero.CrearTablero();
        System.out.println("\n");
        
        while (gameover) {
            try {
                cont++;
                if ((cont % 2) == 1) {
                    nombre = "jugador 1";
                    System.out.println("Turno del " + nombre);
                }
                else {
                    nombre = "jugador 2";
                    System.out.println("Turno del " + nombre);
                }//fin if

                System.out.println("1. Mover ficha");
                System.out.println("2. Poner muro");
                System.out.print("Elija su opcion: ");
                opc = reader.readLine();

                if (opc.equals("1")) {
                    System.out.println("Digite las coordenas en donde quiere que se mueva la ficha: ");
                    System.out.println("Digite la coordenada y: ");
                    coordenadaY = Integer.parseInt(reader.readLine());

                    System.out.println("Digite la coordenada x: ");
                    coordenadaX = Integer.parseInt(reader.readLine());

                    //Verfica si ha llegado a la ultima linea del tablero
                    if (coordenadaY == 8) {
                        System.out.println("El ganador es: " + nombre);
                        gameover = false;
                    } //fin if
                }
                else if (opc.equals("2")) {
                    System.out.println("Como desea poner el muro");
                    System.out.println("1. Vertical");
                    System.out.println("2. Horizontal");
                    opc = reader.readLine();
                    if (opc.equals("1")) {

                    }
                    else {
                        
                    }//fin if
                }
                else if (opc.equalsIgnoreCase("EXIT")) {
                    System.out.println("Partida interrumpida");
                    gameover = false;
                }//fin if
            } catch (Exception e) {
                System.out.println("Ha insertado una opcion incorrecta");
                gameover = true;
            }//fin try-catch
        }//fin while
    }//fin main
}//fin class
