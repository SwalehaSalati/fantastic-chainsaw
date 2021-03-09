/**
 * 
 */
package com.mindtree.exception;

/**
 * @author Banu Prakash
 *
 */
public class ServiceException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5659284489469328698L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceException [getClass()=" + getClass() + ", getMessage()="
				+ getMessage() + "]";
	}

}
