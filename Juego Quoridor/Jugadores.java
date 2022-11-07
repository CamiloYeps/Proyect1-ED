public class Jugadores {
    public int x, y;

    //Constructor
    public Jugadores() {
        x = 0;
        y = 0;
    }//fin constructor
         
    public Jugadores(int pos_y, int pos_x) {
        x = pos_x;
        y = pos_y;
    }//fin metodo Jugador1

    public void MoverFichaJugador1(int coordenadaY, int coordenadaX) {
        y = coordenadaY;
        x = coordenadaX;
    }//fin método MoverFichaJugador1

    public void MoverFichaJugador2(int coordenadaY, int coordenadaX) {
        y = coordenadaY;
        x = coordenadaX;
    }//fin método MoverFichaJugador2

    //Método para obtener el valor de la posicion x
    public int getX() {
        return x;
    }

    //Método para obtener el valor de la posicion y
    public int getY() {
        return y;
    }

}//fin class
