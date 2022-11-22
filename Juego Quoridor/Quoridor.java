//Alexander Caballero 8-997-2227 || Nahin Mendoza 8-989-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;

public class Quoridor {
    public static void main(String[] args) throws IOException {
        //Crear objetos
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Variables objvar = new Variables();
        Tablero objtablero = new Tablero();
        Jugadores jug1 = new Jugadores();
        Jugadores jug2 = new Jugadores();

        //Declaracion de variables
        int cont = 0, contar1 = 0, contar2 = 0;
        boolean gameover = true;
        String opc = "";

        objvar.murosjug1 = 10;
        objvar.murosjug2 = 10;
        
        //Imprimir el tablero Quoridor
        objtablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
        objtablero.MostrarTablero(objtablero.tablero);
        System.out.println("\n");
        
        while (gameover) {
            try {
                cont++;
                boolean validar = false;

                //Muestra el turno del jugador
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
                                validar = jug1.MoverFichaJugador1(opc, validar);
                                Registros.RegistrarJugador1(jug1, contar1, opc);
                            } //fin if
                            
                            //Mostrar tablero
                            objtablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
                            objtablero.MostrarTablero(objtablero.tablero);

                            contar1++;

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
                                validar = jug2.MoverFichaJugador2(opc, validar);
                                Registros.RegistrarJugador2(jug2, contar2, opc);
                            }//fin while
                            
                            //Mostrar tablero
                            objtablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
                            objtablero.MostrarTablero(objtablero.tablero);

                            contar2++;

                            //Compara si el jugador2 ha llagado a la ultima fila del tablero
                            if (jug2.getY2() == 17) {
                                System.out.println("El " + objvar.jugador1 + " ha ganado la partida");
                                gameover = false;
                            }
                        }//fin if
                        break;
                    case "2": {
                        while (!validar) {
                            try {
                                if ((cont % 2) == 1) {
                                    //Comprobar la cantidad de muros
                                    if (objvar.murosjug1 > 0 && objvar.murosjug1 <= 10) {
                                        System.out.println("Introduzca las coordenadas donde desee colocar el muro");
                                        System.out.print("Coordenada x1: ");
                                        objvar.coordenadaX1 = Integer.parseInt(reader.readLine());
                                        System.out.print("Coordenada y1: ");
                                        objvar.coordenadaY1 = Integer.parseInt(reader.readLine());

                                        System.out.print("Coordenada x2: ");
                                        objvar.coordenadaX2 = Integer.parseInt(reader.readLine());
                                        System.out.print("Coordenada y2: ");
                                        objvar.coordenadaY2 = Integer.parseInt(reader.readLine());

                                        //Comprobar de que las coordenadas no se pasen de los limites del tablero
                                        if ((objvar.coordenadaX1 >= 0 && objvar.coordenadaX1 < 8
                                            && objvar.coordenadaY1 > 0 && objvar.coordenadaY1 < 18) && (objvar.coordenadaX2 >= 0 && objvar.coordenadaX2 < 8 && objvar.coordenadaY2 > 0 && objvar.coordenadaY2 < 18)) {
                                            
                                            /*Walls.PonerMuros(objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);*/
                                            validar = true;
                                            
                                            //Comprueba que los muros no ocupen más de dos casilla
                                            /*if (objvar.coordenadaY2 - objvar.coordenadaY1 == 2 || objvar.coordenadaY2 - objvar.coordenadaY1 == -2) {
                                                objvar.murosjug1--;
                                                validar = true;
                                            }
                                            //Comprueba que los muros no ocupen más de dos casilla
                                            if (objvar.coordenadaX2 - objvar.coordenadaX1 == 1 || objvar.coordenadaX2 - objvar.coordenadaX1 == -1) {
                                                objvar.murosjug1--;
                                                validar = true;
                                            }
                                            else {
                                                System.out.println("Error al colocar los muros, intentelo nuevamente");
                                                validar = false;
                                            }//fin if*/
                                        }
                                        else {
                                            System.out.println("el eje x tiene que ser menor a 8 y el eje y tiene que ser menor a 18");
                                            cont--;
                                            validar = false;
                                        }//fin if
                                    } 
                                    else {
                                        System.out.println("No tiene mas muros");
                                    }//fin if
                                }
                                else {
                                    //Comprobar la cantidad de muros
                                    if (objvar.murosjug2 > 0 && objvar.murosjug2 <= 10) {
                                        System.out.println("Introduzca las coordenadas donde desee colocar el muro");
                                        System.out.print("Coordenada x1: ");
                                        objvar.coordenadaX1 = Integer.parseInt(reader.readLine());
                                        System.out.print("Coordenada y1: ");
                                        objvar.coordenadaY1 = Integer.parseInt(reader.readLine());

                                        System.out.print("Coordenada x2: ");
                                        objvar.coordenadaX2 = Integer.parseInt(reader.readLine());
                                        System.out.print("Coordenada y2: ");
                                        objvar.coordenadaY2 = Integer.parseInt(reader.readLine());

                                        //Comprobar de que las coordenadas no se pasen de los limites del tablero
                                        if ((objvar.coordenadaX1 >= 0 && objvar.coordenadaX1 < 8
                                                && objvar.coordenadaY1 > 0 && objvar.coordenadaY1 < 18)
                                                || (objvar.coordenadaX2 >= 0 && objvar.coordenadaX2 < 8
                                                        && objvar.coordenadaY2 > 0 && objvar.coordenadaY2 < 18)) {

                                            //Comprueba que los muros no ocupen más de dos casilla y que sea vertical
                                            if (objvar.coordenadaY2 - objvar.coordenadaY1 == 2
                                                    || objvar.coordenadaY2 - objvar.coordenadaY1 == -2) {
                                                objvar.murosjug1--;
                                                validar = true;
                                            }
                                            //Comprueba que los muros no ocupen más de dos casilla y que sea horizontal
                                            else if (objvar.coordenadaY2 % 2 == 0
                                                    && objvar.coordenadaX2 - objvar.coordenadaX1 == 1
                                                    || objvar.coordenadaX2 - objvar.coordenadaX1 == -1) {
                                                objvar.murosjug1--;
                                                validar = true;
                                            } else {
                                                System.out.println("Error al colocar los muros, intentelo nuevamente");
                                                validar = false;
                                            } //fin if
                                        } 
                                        else {
                                            System.out.println("Las coordenadas no pueden superar el rango 8");
                                        }//fin if
                                    } 
                                    else {
                                        System.out.println("No tiene mas muros");
                                    }//fin if
                                }//fin if
                            } catch (Exception e) {
                                System.out.println("Introduzca bien las coordenadas");
                                validar = false;
                            }//fin try-catch
                        } //fin while

                        //Mostrar tablero
                        objtablero.CrearTablero(jug1, jug2, objvar.coordenadaX1, objvar.coordenadaY1, objvar.coordenadaX2, objvar.coordenadaY2);
                        objtablero.MostrarTablero(objtablero.tablero);
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
        } //fin while
        
        Registros.RegistrarJugador1(jug1, contar1, opc);
        Registros.RegistrarJugador2(jug2, contar2, opc);
    }//fin main
}//fin class
