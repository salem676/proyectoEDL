package jsjf;

/**
 * Implementanción de cola con prioridades mediante arreglos.
 * Extiende a ArrayFIFO.
 * @author zgarciag
 * @param <T> a utilizar.
 */
public class ArrayPriorityQueue<T> extends ArrayFIFO<T> {
    /**
     * Método que añade un elemento a la cola.
     * @param element a añadir.
     * Hace uso del método de la super clase y de mueveArriba para mover los elementos de la cola.
     */
    @Override
    public void enqueue(T element){
        super.enqueue(element);
        mueveArriba(nextLast-1);
    }
    /**
     * Método que mueve los elementos de la cola.
     * Hace uso del método swap, y además es recursivo.
     * @param h que es el último elemento.
     */
    private void mueveArriba(int h){
        int p = (h - 1) / 2;
        if(h > 0 && ((Comparable)array[h]).compareTo(array[p]) > 0){
            swap(h,p);
            mueveArriba(p);
        }    
    }
    /**
     * Método swap que intercambia valores de dos índices.
     * @param h índice uno.
     * @param p índice dos
     */
    private void swap(int h, int p){
        T element = array[h];
        array[h] =  array[p];
        array[p] = element;
    }
    /**
     * Método dequeue que elimina un elemento de la cola.
     * @return elemento que es eliminado con método de la superclase first.
     */
    @Override
    public T dequeue(){
        T res = super.first();
        array[0] = array[nextLast-1];
        array[nextLast-1] = null;
        nextLast--;
        mueveAbajo(0);
        return res; 
    }
    /**
     * Método que mueve hacia abajo los elementos de la cola. Recursivo.
     * @param p índice.
     */
    private void mueveAbajo(int p){
        int hI = (2*p) + 1;
        int hD = (2*p) + 2;
        if(hI < nextLast && hD < nextLast)
            if((((Comparable)array[hI]).compareTo(array[p]) > 0) && (((Comparable)array[hI]).compareTo(array[hD]) > 0)) {
                swap(p,hI);
                mueveAbajo(hI);
            }else
                if( (((Comparable)array[hD]).compareTo(array[p]) > 0) &&(((Comparable)array[hD]).compareTo(array[hI]) > 0) ){
                    swap(p,hD);
                    mueveAbajo(hD);
                }
                else
                    if( ((Comparable)array[hD]).compareTo(array[hI]) == 0 ){
                        swap(p,hD);
                        mueveAbajo(hD);
                    }
        else
            if(hI < nextLast && hD >= nextLast)
                if((((Comparable)array[hI]).compareTo(array[p]) > 0)){
                    swap(p,hI);
                    mueveAbajo(hI);
                }
            else 
                if(hD < nextLast && hI >= nextLast)
                    if((((Comparable)array[hD]).compareTo(array[p]) > 0)){
                        swap(p,hD);
                        mueveAbajo(hD);
                    }
    }

}
