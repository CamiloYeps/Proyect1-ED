public class Jugadores {
    public int coorx1, coory1, coorx2, coory2;

    //Constructor
    public Jugadores() {
        coorx1 = 5;
        coory1 = 9;
        coorx2 = 5;
        coory2 = 1;
    }//fin constructor

    public void MoverFichaJugador1(String opcion) {
        if (opcion.equals("1")) {
            coory1--;
        }
        else if (opcion.equals("2")) {
            coorx1--;
            if (coorx1 == 0) {
                coorx1++;
            }//fin if
        }
        else if (opcion.equals("3")) {
            coorx1++;
            if (coorx1 == 10) {
                coorx1--;
            }//fin if
        }
        else {
            coory1++;
            if (coory1 == 10) {
                coory1--;
            }//fin if
        }//fin if
    }//fin método MoverFichaJugador1

    public void MoverFichaJugador2(String opcion) {
        if (opcion.equals("1")) {
            coory2++;
            if (coory2 == 0) {
                coory2--;
            }
        }
        else if (opcion.equals("2")) {
            coorx2--;
            if (coorx2 == 0) {
                coorx2--;
            }//fin if
        }
        else if (opcion.equals("3")) {
            coorx2++;
            if (coorx2 == 10) {
                coorx2--;
            }//fin if
        }
        else {
            coory2++;
        }
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
