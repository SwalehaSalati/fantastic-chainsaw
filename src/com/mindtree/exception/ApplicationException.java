/**
 * 
 */
package com.mindtree.exception;

/**
 * @author Banu Prakash
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2180348972548317896L;

	public ApplicationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ApplicationException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ApplicationException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApplicationException [getClass()=" + getClass()
				+ ", getMessage()=" + getMessage() + "]";
	}


}
