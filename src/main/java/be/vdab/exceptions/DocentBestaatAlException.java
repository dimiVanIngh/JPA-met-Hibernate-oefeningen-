package be.vdab.exceptions;

public class DocentBestaatAlException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    public DocentBestaatAlException() {
    }

    public DocentBestaatAlException(String msg) {
        super(msg);
    }

    public DocentBestaatAlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocentBestaatAlException(Throwable cause) {
        super(cause);
    }
}