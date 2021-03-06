/*
 * @author Mayank
 */
package in.co.rays.project_0.exception;

/**
 * The Class ApplicationException.
 */
public class ApplicationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * param msg
     *            : Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}
