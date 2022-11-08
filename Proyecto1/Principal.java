import java.io.*;

public class Principal {
    
    public static void main(String[] args) throws IOException {
        //Creacion de objetos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        HojaPresentacion objPresentacion = new HojaPresentacion();
        //Declaracion de las variables
        int opc;

        do {
            System.out.println("\t\t\t\t Menu Principal");
            System.out.println("\t\t    Operaciones con Estrutura de Datos Lineales");
            System.out.print("\n");
            System.out.println("\t 1. Hoja de Presentacion (Integrantes del Grupo)");
            System.out.println("\t 2. Operaciones con Pila");
            System.out.println("\t 3. Operaciones con Cola Simple");
            System.out.println("\t 4. Operaciones con Cola Circular");
            System.out.println("\t 5. Salir del Programa");
            System.out.print("\t Escoga una opcion: ");
            opc = Integer.parseInt(leer.readLine());
            System.out.println("\n");

            switch (opc) {
                case 1: {
                    objPresentacion.Presentacion();
                    break;
                }
                case 2: {
                    OperacionPila.Pila();
                    break;
                }
                case 3: {
                    OperacionCola.Cola();
                    break;
                }
                case 4: {
                    objPresentacion.Presentacion();
                    break;
                }
                default: {
                    break;
                }
            }//fin switch case
        } while (opc != 5);//fin do while
        leer.close();
    }//fin main
}//fin class
