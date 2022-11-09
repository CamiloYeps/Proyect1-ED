import java.io.*;

public class OperacionColaCircular {
    public static void ColaCircular() throws IOException {
        //Crear objeto de lectura
        BufferedReader obtener = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de variables
        int frente = -1, fin = -1, max = 5;
        String[] colacircular = new String[max];
        String dato = " ";
        boolean validar = true;

        while (validar) {
            try {
                System.out.println("\n");
                System.out.println("\t\t\t\t Menu");
                System.out.println("\t\t  Operaciones con Cola Circular");

                System.out.println("1. Insertar Elementos a la Cola Circular");
                System.out.println("2. Eliminar Elementos de la Cola Circular");
                System.out.println("3. Mostrar la Cola Circular");
                System.out.println("4. Retonar al Menu Principal");
                System.out.print("Escoga una opcion: ");
                int opc = Integer.parseInt(obtener.readLine());

                if (opc == 1) {
                    if ((fin == (max - 1) && frente == 0) || fin == (frente - 1)) {
                        System.out.println("ERROR: desbordamiento cola circular llena");
                    }
                    else {
                        if (fin == (max - 1)) {
                            fin = 0;
                            if (fin == 0) {
                                System.out.println("Inserte los elementos en la cola circular: ");
                                colacircular[fin] = obtener.readLine();
                            }
                        }//fin if
                        else {
                            fin++;
                            System.out.println("Inserte los elementos en la cola circular: ");
                            colacircular[fin] = obtener.readLine();
                        }//fin if
                        if (frente == -1) {
                            frente = 0;
                        }//fin if
                    }//fin if
                }
                else if (opc == 2) {
                    if (frente == -1 && fin == -1) {
                        System.out.println("ERROR: subdesbordamiento cola vacia");
                    }
                    else {
                        dato = colacircular[frente];
                        System.out.println("Se ha eliminado un elemento de la cola");
                        if (frente == fin) {
                            frente = -1;
                            fin = -1;
                        }
                        else {
                            if (frente == (max - 1)) {
                                frente = 0;
                            }
                            else {
                                frente++;
                            }//fin if
                        }//fin if
                    }//fin if
                }
                else if (opc == 3) {
                    int aux = frente;
                    System.out.println("Los Elementos de la cola circular son:");
                    do {
                        System.out.print(colacircular[aux] + " ");
                        aux++;
                        if (aux == max && frente > fin) {
                            aux = 0;
                        }//fin if
                    } while (aux != fin + 1);//fin do while
                    
                    if (frente == 0 && fin < max) {
                        System.out.println("Los Elementos de la cola circular son:");
                        for (int i = frente; i < max; i++) {
                            System.out.print(colacircular[i] + " ");
                        }//fin for
                    } //fin if
                    System.out.println("\nfrente = " + frente + "\nfinal = " + fin + "\ndato = " + dato);
                }
                else {
                    System.out.println("Saliendo de Operaciones con Cola Circular");
                    validar = false;
                }//fin if
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                validar = true;
            }//fin try-catch

            
        }//fin while
    }//fin metodo ColaCircular
}//fin class
