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
        Tablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
        System.out.println("\n");
        
        while (gameover) {
            try {
                cont++;
                boolean validar = false;
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
                            while (!validar) {
                                System.out.println("1. Mover hacia ARRIBA");
                                System.out.println("2. Mover hacia IZQUIERDA");
                                System.out.println("3. Mover hacia DERECHA");
                                System.out.println("4. Mover hacia ABAJO");
                                System.out.print("En que direccion desea desplazar la ficha: ");

                                opc = reader.readLine();
                                validar = jug1.MoverFichaJugador1(opc,validar);
                            }//fin if
                            Tablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);

                            //Compara si el jugador1 ha llagado a la primera fila del tablero
                            if (jug1.getY1() == 1) {
                                System.out.println("El " + objvar.jugador1 + " ha ganado la partida");
                                gameover = false;
                            }
                        }
                        else {
                            while (!validar) {
                                System.out.println("1. Mover hacia ARRIBA");
                                System.out.println("2. Mover hacia IZQUIERDA");
                                System.out.println("3. Mover hacia DERECHA");
                                System.out.println("4. Mover hacia ABAJO");
                                System.out.print("En que direccion desea desplazar la ficha: ");

                                opc = reader.readLine();
                                validar = jug2.MoverFichaJugador2(opc,validar);
                            }//fin while
                            Tablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);

                            //Compara si el jugador2 ha llagado a la primera fila del tablero
                            if (jug2.getY2() == 9) {
                                System.out.println("El " + objvar.jugador1 + " ha ganado la partida");
                                gameover = false;
                            }
                        }//fin if
                        break;
                    case "2": {
                        while (!validar) {
                            try {
                                System.out.println("Introduzca las coordenadas donde desee colocar el muro");
                                System.out.print("Coordenada x1: ");
                                objvar.coordenadaX1 = Integer.parseInt(reader.readLine());
                                System.out.print("Coordenada y1: ");
                                objvar.coordenadaY1 = Integer.parseInt(reader.readLine());

                                System.out.print("Coordenada x2: ");
                                objvar.coordenadaX2 = Integer.parseInt(reader.readLine());
                                System.out.print("Coordenada y2: ");
                                objvar.coordenadaY2 = Integer.parseInt(reader.readLine());

                                //Comprobar de que las coordenadas no se pasen del rango del tablero
                                if ((objvar.coordenadaX1 > 0 && objvar.coordenadaX1 < 9
                                    && objvar.coordenadaY1 > 0 && objvar.coordenadaY1 < 9) || (objvar.coordenadaX2 > 0 && objvar.coordenadaX2 < 9 && objvar.coordenadaY2 > 0 && objvar.coordenadaY2 < 9)) {
                                    
                                    //Comprueba que los muros no ocupen más de dos casilla y si los muros son verticales
                                    if (objvar.coordenadaX2 - objvar.coordenadaX1 == 1 || objvar.coordenadaY2 - objvar.coordenadaY1 == 1) {
                                        validar = true;
                                    }
                                    else {
                                        System.out.println("Error al colocar los muros, intentelo nuevamente");
                                        validar = false;
                                    }//fin if
                                }
                                else {
                                    System.out.println("Las coordenadas no pueden superar el rango 9");
                                }//fin if
                            } catch (Exception e) {
                                System.out.println("Introduzca bien las coordenadas");
                                validar = false;
                            }//fin try-catch
                        } //fin while
                        Tablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
                        break;
                    }
                    default:
                        System.out.println("Opcion invalida");
                        cont--;
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
