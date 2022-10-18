import java.util.*;

public class OperacionPila {
    public void Pila() {
        //Declaracion de objeto de lectura
        Scanner obtener = new Scanner(System.in);
        InsertarPila insertar = new InsertarPila();
        EliminarPila eliminar = new EliminarPila();
        //Declaracion de las variables
        int eleccion, max = 5, tope = -1;
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
            insertar.push(pila,max,tope);
        }
        if (eleccion == 2) {
            eliminar.pop(pila, tope);
        }
        if (eleccion == 3) {
            for (int i = tope; i <= tope; tope--) {
                if (i >= 0) {
                    System.out.print(pila[i] + " ");
                }
            }
        }
        else {

        }
        obtener.close();
    }//fin metodo pila
}//fin class OperacionPila
