/**
 * 
 */
package com.mindtree.service;

import java.util.List;

import com.mindtree.dao.CarDao;
import com.mindtree.dao.DaoFactory;
import com.mindtree.dao.RentalDao;
import com.mindtree.exception.ApplicationException;
import com.mindtree.exception.DaoException;
import com.mindtree.exception.ServiceException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;
import com.mindtree.model.Customer;
import com.mindtree.model.Rental;

/**
 * @author Banu Prakash
 *
 */
public class RentalServiceImpl implements RentalService {

	/* (non-Javadoc)
	 * @see com.mindtree.service.RentalService#addCar(com.mindtree.model.Car)
	 */
	@Override
	public void addCar(Car car) throws ServiceException {
		try {
			CarDao carDao = DaoFactory.getInstance().getCarDao();
			carDao.addCar(car);
		} catch (DaoException e) {
	 		 throw new ServiceException("Rental Service not Available", e);
		}
		catch (ApplicationException e) {
			throw new ServiceException("Rental Service not Available", e);
		}
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.RentalService#getAllCategories()
	 */
	@Override
	public List<Category> getAllCategories() throws ServiceException {
		try {
			CarDao carDao = DaoFactory.getInstance().getCarDao();
			return carDao.getCategories();
		} catch (DaoException e) {
	 		 throw new ServiceException("Rental Service not Available", e);
		}
		catch (ApplicationException e) {
			throw new ServiceException("Rental Service not Available", e);
		}
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.RentalService#getRental(com.mindtree.model.Car)
	 */
	@Override
	public List<Rental> getRental(Car car) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.RentalService#rentCar(com.mindtree.model.Rental)
	 */
	@Override
	public void rentCar(Rental rental) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Car> getCars() throws ServiceException {
		try {
			RentalDao rentalDao = DaoFactory.getInstance().getRentalDao();
			return rentalDao.getAllCars();
		} catch (DaoException e) {
	 		 throw new ServiceException("Rental Service not Available", e);
		}
		catch (ApplicationException e) {
			throw new ServiceException("Rental Service not Available", e);
		}
	}

	@Override
	public List<Customer> getCustomers() throws ServiceException {
		try {
			RentalDao rentalDao = DaoFactory.getInstance().getRentalDao();
			return rentalDao.getAllCustomers();
		} catch (DaoException e) {
	 		 throw new ServiceException("Rental Service not Available", e);
		}
		catch (ApplicationException e) {
			throw new ServiceException("Rental Service not Available", e);
		}
	}

}
