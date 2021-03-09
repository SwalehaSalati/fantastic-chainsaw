package com.mindtree.service;

import java.util.List;

import com.mindtree.exception.ServiceException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;
import com.mindtree.model.Customer;
import com.mindtree.model.Rental;

public interface RentalService {
	public List<Category> getAllCategories() throws ServiceException;
	public void addCar(Car car) throws ServiceException;
	public void rentCar(Rental rental) throws ServiceException;
	public List<Rental> getRental(Car car) throws ServiceException;
	
	public List<Customer> getCustomers() throws ServiceException;
	public List<Car> getCars() throws ServiceException;
}
