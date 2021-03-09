package com.mindtree.dao;

import java.util.List;

import com.mindtree.exception.DaoException;
import com.mindtree.model.Car;
import com.mindtree.model.Customer;
import com.mindtree.model.Rental;

public interface RentalDao {
	public void rentCar(Rental rental) throws DaoException;
	public List<Rental> getRentals(Car car) throws DaoException;
	public List<Customer> getAllCustomers() throws DaoException;
	public List<Car> getAllCars() throws DaoException;
}
