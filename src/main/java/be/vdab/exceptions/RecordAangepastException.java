package be.vdab.exceptions;

public class RecordAangepastException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RecordAangepastException() {
	}

	public RecordAangepastException(String msg) {
		super(msg);
	}

	public RecordAangepastException(String message, Throwable cause) {
		super(message, cause);
	}

	public RecordAangepastException(Throwable cause) {
		super(cause);
	}
}
