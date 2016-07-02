package typesystem;

/**
 * @author Moklev Vyacheslav
 */
public class TypeDeductionException extends RuntimeException {
    public TypeDeductionException() {
        super();
    }

    public TypeDeductionException(String message) {
        super(message);
    }
}
