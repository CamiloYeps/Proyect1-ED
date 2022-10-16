import java.util.*;
import java.util.Arrays;

public class OperacionPila {
    public void Pila() {
        //Declaracion de objeto de lectura
        Scanner obtener = new Scanner(System.in);
        //Declaracion de las variables
        int eleccion, max = 5;
        String[] pila = new String[max];

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
            
        }
        if (eleccion == 2) {

        }
        if (eleccion == 3) {

        }
        else {

        }
        obtener.close();
    }
}
