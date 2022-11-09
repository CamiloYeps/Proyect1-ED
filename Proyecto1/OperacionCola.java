import java.io.*;

import javax.xml.validation.Validator;

public class OperacionCola {
    public static void Cola() throws IOException {
        //Crear objeto de lectura
        BufferedReader obtener = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de variables
        int frente = -1, fin = -1, max = 5;
        String[] cola = new String[max];
        String dato = " ";
        boolean validar = true;

        while (validar) {
            try {
                System.out.println("\n");
                System.out.println("\t\t\t\t Menu");
                System.out.println("\t\t    Operaciones con Cola");

                System.out.println("1. Insertar Elementos a la Cola");
                System.out.println("2. Eliminar Elementos de la Cola");
                System.out.println("3. Mostrar la Cola");
                System.out.println("4. Retonar al Menu Principal");
                System.out.print("Escoga una opcion: ");
                int opc = Integer.parseInt(obtener.readLine());

                if (opc == 1) {
                    if (fin == (max - 1)) {
                        System.out.println("ERROR: desbordamiento cola llena");
                    }
                    else if (fin < (max - 1)) {
                        fin++;
                        System.out.println("Inserte los elementos en la cola: ");
                        cola[fin] = obtener.readLine();
                        if (fin == 0) {
                            frente = 0;
                        }//fin if
                    }//fin if
                }
                else if (opc == 2) {
                    if (frente == -1 && fin == -1) {
                        System.out.println("ERROR: subdesbordamiento cola vacia");
                    }
                    else if (frente <= fin) {
                        dato = cola[frente];
                        System.out.println("Se ha eliminado un elemento de la cola");
                        if (frente == fin) {
                            frente = -1;
                            fin = -1;
                        }
                        else {
                            frente++;
                        }//fin if
                    }//fin if
                }
                else if (opc == 3) {
                    System.out.println("Los Elementos de la cola son:");
                    for (int i = frente; i <= fin; i++) {
                        System.out.print(cola[i] + " ");
                    }
                    System.out.println("\nfrente = " + frente + "\nfinal = " + fin + "\ndato = " + dato);
                }
                else {
                    System.out.println("\nSaliendo de Operaciones con Cola");
                    validar = false;
                }//fin if
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                validar = true;
            }//fin try-catch
        }//fin while
    }//fin metodo Cola
}//fin class OperacionCola
