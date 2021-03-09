package com.mindtree.dao.jdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.dao.RentalDao;
import com.mindtree.exception.DaoException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;
import com.mindtree.model.Customer;
import com.mindtree.model.Rental;

public class RentalDaoJdbcImpl extends BaseDao implements RentalDao {

	private static final String GET_ALL_CUSTOMERS =
			"select ID,USERNAME,PASSWORD from customer";
	private static final String GET_ALL_CARS =
			"select Car_ID,REG_NO from car";
	
	@Override
	public List<Car> getAllCars() throws DaoException {
		 Connection con = null;
		 con = getConnection();
		 PreparedStatement psmt  = null;
		 List<Car> carList = new ArrayList<Car>();
		 try {
			psmt = con.prepareStatement(GET_ALL_CARS);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Car car = new Car();
					car.setCarId(rs.getInt("CAR_ID"));
					car.setRegistrationNo(rs.getString("REG_NO"));
				carList.add(car);
			}
		} catch (SQLException e) {
			throw new DaoException("Not able to get car List", e);
		} finally {
			closeResource(psmt, con);
		}
	 	return carList;
	}

	@Override
	public List<Customer> getAllCustomers() throws DaoException {
		Connection con = null;
		 con = getConnection();
		 PreparedStatement psmt  = null;
		 List<Customer> customerList = new ArrayList<Customer>();
		 try {
			psmt = con.prepareStatement(GET_ALL_CUSTOMERS);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("ID"));
				customer.setUserName(rs.getString("USERNAME"));
				customerList.add(customer);
			}
		} catch (SQLException e) {
			throw new DaoException("Not able to get customer  List", e);
		} finally {
			closeResource(psmt, con);
		}
	 	return customerList;
	}

	@Override
	public List<Rental> getRentals(Car car) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rentCar(Rental rental) throws DaoException {
		// TODO Auto-generated method stub

	}

}
