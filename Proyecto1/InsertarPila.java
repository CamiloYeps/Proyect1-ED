import java.util.*;

public class InsertarPila {
    public void push(String[] pila, int maximo, int tope) {
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
}//fin class InsertarPila
