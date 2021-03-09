package com.mindtree.dao;

import java.util.List;

import com.mindtree.exception.DaoException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;

public interface CarDao {
	public void addCar(Car car) throws DaoException;
	public List<Category> getCategories() throws DaoException;
}
