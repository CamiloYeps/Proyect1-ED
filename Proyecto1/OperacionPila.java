import java.io.*;

public class OperacionPila {
    public static void Pila() throws IOException {
        //Crear objeto de lectura
        BufferedReader obtener = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de las variables
        int eleccion, max = 5, tope = -1;
        String[] pila = new String[max];
        String dato = " ";
        boolean validar = true;

        while (validar) {
            try {
                System.out.println("\n");
                System.out.println("\t\t\t\t Menu");
                System.out.println("\t\t    Operaciones con Pila");
                System.out.print("\n");
                System.out.println("1. Insertar Elementos a la Pila");
                System.out.println("2. Eliminar Elementos de la Pila");
                System.out.println("3. Mostrar la Pila");
                System.out.println("4. Retonar al Menu Principal");
                System.out.print("Escoga una opcion: ");
                eleccion = Integer.parseInt(obtener.readLine());

                if (eleccion == 1) {
                    if (tope == (max - 1)) {
                        System.out.println("ERROR: desbordamiento pila llena");
                    }
                    else if (tope != max) {
                        tope++;
                        System.out.println("Introduzca el elemento: ");
                        pila[tope] = obtener.readLine();
                    } //fin if
                }
                else if (eleccion == 2) {
                    if (tope == -1) {
                        System.out.println("ERROR: subdesbordamiento pila vacia");
                    }
                    else if (tope != -1) {
                        dato = pila[tope];
                        tope = tope - 1;
                        System.out.println("Se ha eliminado un elemento de la pila");
                    }//fin if
                }
                else if (eleccion == 3) {
                    System.out.println("Los Elementos de la pila son:");
                    for (int i = 0; i <= tope; i++) {
                        System.out.print(pila[i] + " ");
                    }
                    System.out.println("\ntope = " + tope);
                }
                else {
                    System.out.println("\nSaliendo de Operaciones con Pila");
                    validar = false;
                } //fin if
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                validar = true;
            }//fin try-catch
        }//fin while
    }//fin metodo pila
}//fin class OperacionPila
