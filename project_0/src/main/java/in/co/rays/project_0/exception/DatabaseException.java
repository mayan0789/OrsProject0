/*
 * @author Mayank
 */
package in.co.rays.project_0.exception;

/**
 * The Class DatabaseException.
 */
public class DatabaseException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * param msg
     *            : Error message
     */
    public DatabaseException(String msg) {
        super(msg);
    }
}
