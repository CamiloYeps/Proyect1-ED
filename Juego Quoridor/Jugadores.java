//Alexander Caballero 8-997-2227 || Nahin Mendoza 8-989-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

public class Jugadores {
    public int coorx1, coory1, coorx2, coory2;

    //Constructor
    public Jugadores() {
        coorx1 = 4;
        coory1 = 17;
        coorx2 = 4;
        coory2 = 1;
    }//fin constructor

    public boolean MoverFichaJugador1(String opcion, boolean validar) {
        if (opcion.equals("1")) {
            coory1-= 2;
            validar = true;
        }
        else if (opcion.equals("2")) {
            coorx1--;
            validar = true;
            if (coorx1 == -1) {
                coorx1++;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else if (opcion.equals("3")) {
            coorx1++;
            validar = true;
            if (coorx1 == 9) {
                coorx1--;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else if (opcion.equals("4")) {
            coory1+= 2;
            validar = true;
            if (coory1 == 19) {
                coory1-= 2;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else {
            System.out.println("Ha introducido una opcion incorrecta, intentelo nuevamente");
            validar = false;
        }//fin if
        return validar;
    }//fin método MoverFichaJugador1

    public boolean MoverFichaJugador2(String opcion, boolean validar) {
        if (opcion.equals("1")) {
            coory2-= 2;
            validar = true;
            if (coory2 == -1) {
                coory2+= 2;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else if (opcion.equals("2")) {
            coorx2--;
            validar = true;
            if (coorx2 == -1) {
                coorx2++;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else if (opcion.equals("3")) {
            coorx2++;;
            validar = true;
            if (coorx2 == 9) {
                coorx2--;
                System.out.println("Ficha no movida");
                validar = false;
            }//fin if
        }
        else if (opcion.equals("4")) {
            coory2+= 2;
            validar = true;
        }
        else {
            System.out.println("Ha introducido una opcion incorrecta, intentelo nuevamente");
            validar = false;
        }
        return validar;
    }//fin método MoverFichaJugador2

    //Método para obtener el valor de la posicion x1
    public int getX1() {
        return coorx1;
    }

    //Método para obtener el valor de la posicion y1
    public int getY1() {
        return coory1;
    }

    //Método para obtener el valor de la posicion x2
    public int getX2() {
        return coorx2;
    }

    //Método para obtener el valor de la posicion y2
    public int getY2() {
        return coory2;
    }

}//fin class
