public class EliminarPila {
    public void pop(String[] pila, int tope) {
        
        if (tope == -1) {
            System.out.println("ERROR: subdesbordamiento pila vacia");
        }
        else if (tope != -1) {
            String dato = pila[tope];
            tope = tope - 1;
        }//fin if
    }// fin metodo pop
}//fin class EliminarPila
