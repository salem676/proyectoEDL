
package jsjf;

/**
 * Define la interface para una colección de pila.
 * @author zgarciag
 * @param <T> tipo de datos.
 */
public interface StackADT<T> extends LinearCollectionADT <T>{
    /**
     * Agrega el elemento especificado al tope de la pila.
     * @param element elemento ingresado a la pila.
     */
    public void push(T element);
    /**
     * Quita y regresa el elemento en el tope.
     * @return regresa el elemento quitado de la pila.
     */
    public T pop();
    /**
     * Regresa sin remover el elemento de esta pila.
     * @return el elemento al principio de la pila.
     */
    public T peek();
}
