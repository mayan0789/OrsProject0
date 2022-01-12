/*
 * @author Mayank
 */
package in.co.rays.project_0.exception;

/**
 * The Class RecordNotFoundException.
 */
public class RecordNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * param msg
     *            error message
     */
    public RecordNotFoundException(String msg) {
        super(msg);

    }
}
