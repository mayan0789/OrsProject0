/*
 * @author Mayank
 */
package in.co.rays.project_0.exception;

/**
 * The Class DuplicateRecordException.
 */
public class DuplicateRecordException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * param msg
     *            error message
     */
    public DuplicateRecordException(String msg) {
        super(msg);
    }

}
