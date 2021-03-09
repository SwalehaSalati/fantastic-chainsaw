package com.mindtree.dao;

import java.util.ResourceBundle;

import com.mindtree.exception.ApplicationException;

public class DaoFactory {
	private static DaoFactory instance = null;
	private String carDao;
	private String rentalDao;
	 
	private DaoFactory() {
		ResourceBundle resource = ResourceBundle
				.getBundle("com.mindtree.dao.DBConfig");
		carDao = resource.getString("carDao");
		rentalDao = resource.getString("rentalDao");
	}

	public CarDao getCarDao() throws ApplicationException {
		try {
			return (CarDao) Class.forName(carDao).newInstance();
		} catch (Exception e) {
			throw new ApplicationException("Unable to Get CarDao", e);
		}
	}
	public RentalDao getRentalDao() throws ApplicationException {
		try {
			return (RentalDao) Class.forName(rentalDao).newInstance();
		} catch (Exception e) {
			throw new ApplicationException("Unable to Get rentalDao", e);
		}
	}
	
	public  static DaoFactory getInstance() {
		if (instance == null) {
			synchronized (DaoFactory.class) {
				instance = new DaoFactory();
			}
		}
		return instance;
	}
}
