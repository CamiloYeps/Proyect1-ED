import java.util.*;

public class Pila {
    public static void push(String[] pila, int maximo, int tope) {
        //Crear objeto de lectura
        Scanner leer = new Scanner(System.in);

        if (tope == (maximo - 1)) {
            System.out.println("ERROR: desbordamiento pila llena");
        }
        else if (tope != maximo) {
            tope = tope + 1;
            System.out.println("Introduzca el elemento: ");
            pila[tope] = leer.nextLine();
        } //fin if
        leer.close();
    }//fin metodo push

    public static void pop(String[] pila, int tope) {
        
        if (tope == -1) {
            System.out.println("ERROR: subdesbordamiento pila vacia");
        }
        else if (tope != -1) {
            String dato = pila[tope];
            tope = tope - 1;
        }//fin if
    }// fin metodo pop
}
