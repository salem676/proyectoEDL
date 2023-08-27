package jsjf.exceptions;

/**
 *
 * @author Enrique Valencia
 */
public class FullCollectionException extends RuntimeException {
    
    public FullCollectionException(String cad){
        super("The collection '" + cad + "' is full.");
    }
    
}
