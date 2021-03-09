/**
 * 
 */
package com.mindtree.exception;

/**
 * @author Banu Prakash
 *
 */
public class DaoException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5088220616274790428L;

	public DaoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public DaoException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public DaoException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DaoException [getClass()=" + getClass() + ", getMessage()="
				+ getMessage() + "]";
	}

}
