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
        int cont = 0;
        boolean gameover = true;
        String opc;

        objvar.murosjug1 = 10;
        objvar.murosjug2 = 10;
        
        //Imprimir el tablero Quoridor
        objtablero.CrearTablero(jug1, jug2, objvar.x1, objvar.y1, objvar.x2, objvar.y2);
        objtablero.MostrarTablero();
        System.out.println("\n");
        
        //Guarda la posición inicial de ambos jugadores
        objvar.registro1.add(jug1.getX1());
        objvar.registro1.add(jug1.getY1());
        objvar.registro2.add(jug2.getX2());
        objvar.registro2.add(jug2.getY2());
        while (gameover) {
            cont++;
            boolean validar = false;

            //Muestra el turno del jugador y la posición en la que está
            if ((cont % 2) == 1) {
                System.out.println("Turno del " + objvar.jugador1);
                System.out.println("Posicion actual de su ficha (x, y): " + jug1.getX1() + ", " + jug1.getY1());
            }
            else {
                System.out.println("Turno del " + objvar.jugador2);
                System.out.println("Posicion actual de su ficha (x, y): " + jug2.getX2() + ", " + jug1.getY2());
            }//fin if
            System.out.println("1. Mover ficha");
            System.out.println("2. Poner muro");
            System.out.println("3. EXIT para retirarse");
            System.out.print("Elija su opcion: ");
            opc = reader.readLine();

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
                        } //fin if

                        //Guardar la posición actual del jugador1
                        objvar.registro1.add(jug1.getX1());
                        objvar.registro1.add(jug1.getY1());

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
                        } //fin while
                        
                        //Guardar la posición actual del jugador1
                        objvar.registro2.add(jug2.getX2());
                        objvar.registro2.add(jug2.getY2());

                        //Compara si el jugador2 ha llagado a la ultima fila del tablero
                        if (jug2.getY2() == 17) {
                            System.out.println("El " + objvar.jugador2 + " ha ganado la partida");
                            gameover = false;
                        }
                    } //fin if
                    //Mostrar tablero
                    objtablero.CrearTablero(jug1, jug2, objvar.x1, objvar.y1, objvar.x2, objvar.y2);
                    objtablero.MostrarTablero();
                    break;
                
                case "2": {
                    while (!validar) {
                        try {
                            if ((cont % 2) == 1) {
                                //Comprobar la cantidad de muros
                                if (objvar.murosjug1 > 0) {
                                    System.out.println("Introduzca las coordenadas donde desee colocar el muro");
                                    System.out.print("Coordenada x1: ");
                                    objvar.x1 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada y1: ");
                                    objvar.y1 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada x1: ");
                                    objvar.x2 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada y1: ");
                                    objvar.y2 = Integer.parseInt(reader.readLine());

                                    //Comprobar de que las coordenadas no se pasen de los limites del tablero
                                    if (objvar.x1 >= 0 && objvar.x1 < 8 && objvar.y1 > 0 && objvar.y1 < 18
                                        && objvar.x2 >= 0 && objvar.x2 < 8 && objvar.y2 > 0 && objvar.y2 < 18) {
                                        //Mostrar tablero
                                        objtablero.CrearTablero(jug1, jug2, objvar.x1, objvar.y1, objvar.x2, objvar.y2);
                                        objtablero.MostrarTablero();
                                        objvar.murosjug1--;
                                        validar = true;
                                    } else {
                                        System.out.println(
                                                "el eje x tiene que ser menor a 8 y el eje y tiene que ser mayor a 0 y menor a 18");
                                        validar = false;
                                    } //fin if
                                } 
                                else {
                                    System.out.println("No tiene mas muros");
                                } //fin if
                            } 
                            else {
                                //Comprobar la cantidad de muros
                                if (objvar.murosjug2 > 0) {
                                    System.out.println("Introduzca las coordenadas donde desee colocar el muro");
                                    System.out.print("Coordenada x1: ");
                                    objvar.x1 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada y1: ");
                                    objvar.y1 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada x1: ");
                                    objvar.x2 = Integer.parseInt(reader.readLine());
                                    System.out.print("Coordenada y1: ");
                                    objvar.y2 = Integer.parseInt(reader.readLine());

                                    //Comprobar de que las coordenadas no se pasen de los limites del tablero
                                    if (objvar.x1 >= 0 && objvar.x1 < 8 && objvar.y1 > 0 && objvar.y1 < 18
                                        && objvar.x2 >= 0 && objvar.x2 < 8 && objvar.y2 > 0 && objvar.y2 < 18) {
                                        //Mostrar tablero
                                        objtablero.CrearTablero(jug1, jug2, objvar.x1, objvar.y1, objvar.x2, objvar.y2);
                                        objtablero.MostrarTablero();
                                        objvar.murosjug2--;
                                        validar = true;
                                    } else {
                                        System.out.println( "el eje x tiene que ser menor a 8 y el eje y tiene que ser mayor a 0 y menor a 18");
                                        validar = false;
                                    } //fin if
                                } 
                                else {
                                    System.out.println("No tiene mas muros");
                                } //fin if
                            } //fin if
                        } catch (Exception e) {
                            System.out.println("Introduzca bien las coordenadas");
                            validar = false;
                        } //fin try-catch
                    }//fin while
                    break;
                }
                
                case "3": {
                    //Comprueba si uno de los jugadores ha introducido EXIT
                    if ((cont % 2) == 1) {
                        System.out.println("El ganador es " + objvar.jugador2);
                    }
                    else {
                        System.out.println("El ganador es " + objvar.jugador1);
                    } //fin if
                    gameover = false;
                }
                default:
                    System.out.println("Opcion invalida");
                    cont--;
                    break;
            }//fin switch case
        } //fin while

        //Mostrar recorrido del jugador1
        System.out.println("x, y");
        for (int i = 0; i < objvar.registro1.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(objvar.registro1.get(i) + ", ");
            }
            else {
                System.out.println(objvar.registro1.get(i));
            }//fin if
        } //fin for
        
        System.out.print("\n");

        //Mostrar recorrido del jugador2
        System.out.println("x, y");
        for (int i = 0; i < objvar.registro2.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(objvar.registro2.get(i) + ", ");
            }
            else {
                System.out.println(objvar.registro2.get(i));
            }//fin if
        }//fin for
    }//fin main
}//fin class
