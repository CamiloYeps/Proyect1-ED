import java.io.*;

public class Principal {
    
    public static void main(String[] args) throws IOException {
        //Creacion de objeto de lectura
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de las variables
        int opc;
        boolean validar = true;

        do {
            try {
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
                        HojaPresentacion.Presentacion();
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
                        OperacionColaCircular.ColaCircular();
                        break;
                    }
                    case 5: {
                        System.out.println("\t Que tenga un buen dia");
                    }
                    default: {
                        System.out.println("\t ERROR: opcion invalida, intente nuevamente");
                        break;
                    }
                }//fin switch case
            } catch (Exception e) {
                System.out.println("\t Ha insertado un caracter que no es entero.");
                System.out.println("\n");
                validar = true;
            }
        } while (validar);//fin do while
    }//fin main
}//fin class
