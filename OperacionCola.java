import java.util.Scanner;

import javax.lang.model.element.Element;

public class OperacionCola {
    public void InsertElementCola(String variable) {
        //Crear objeto de lectura
        Scanner leer = new Scanner(System.in);
        String[] cola = new String[5];

        System.out.println("Menu");
        System.out.println("Operaciones con Cola");

        System.out.println("1. Insertar Elementos a la Cola");
        System.out.println("2. Eliminar Elementos de la Cola");
        System.out.println("3. Mostrar la Cola");
        System.out.println("4. Retonar al Menu Principal");
        int opc = leer.nextInt();

        if (opc == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Inserte el elemento #" + (i + 1) + ": ");
                cola[i] = leer.nextLine();
            }
        }
        if (opc == 2) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Inserte el elemento #" + (i + 1) + ": ");
                cola[i] = leer.nextLine();
            }
        }
    }
}
