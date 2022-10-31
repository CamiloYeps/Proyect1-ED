import java.util.*;

public class OperacionPila {
    public static void Pila() {
        //Declaracion de las variables
        int eleccion, max = 5, tope = -1;
        String[] pila = new String[max];
        boolean validar = true;

        while (validar) {
            //Crear objeto de lectura
            Scanner obtener = new Scanner(System.in);
            System.out.println("\t\t\t\t Menu");
            System.out.println("\t\t    Operaciones con Pila");
            System.out.print("\n");
            System.out.println("1. Insertar Elementos a la Pila");
            System.out.println("2. Eliminar Elementos de la Pila");
            System.out.println("3. Mostrar la Pila");
            System.out.println("4. Retonar al Menu Principal");
            System.out.print("\t Escoga una opcion: ");
            eleccion = obtener.nextInt();

            if (eleccion == 1) {
                Pila.push(pila,max,tope);
            }
            else if (eleccion == 2) {
                Pila.pop(pila, tope);
            }
            else if (eleccion == 3) {
                for (int i = tope; i <= tope; tope--) {
                    if (i >= 0) {
                        System.out.print(pila[i] + " ");
                    }
                }
            }
            else {
                System.out.println("Saliendo de Operaciones con Pila");
            } //fin if
            obtener.close();//cerrar objeto de lectura
        }//fin while
    }//fin metodo pila
}//fin class OperacionPila
