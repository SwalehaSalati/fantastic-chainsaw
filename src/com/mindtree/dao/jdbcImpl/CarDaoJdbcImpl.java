package com.mindtree.dao.jdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.dao.CarDao;
import com.mindtree.exception.DaoException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;

public class CarDaoJdbcImpl extends BaseDao implements CarDao {
	private static final String INSERT_CAR = 
		"insert into car(CAR_ID,REG_NO,MILEAGE,CAT_ID) values (?,?,?,?)";
	
	private static final String GET_CATEGORIES =
			"select CAT_ID,NAME,DESCRIPTION,COST_PER_KM from Category";
	
	@Override
	public void addCar(Car car) throws DaoException {
	 Connection con = null;
	 con = getConnection();
	 PreparedStatement psmt  = null;
	 try {
		psmt = con.prepareStatement(INSERT_CAR);
		psmt.setInt(1, getNextCarID(con));
		psmt.setString(2, car.getRegistrationNo());
		psmt.setDouble(3, car.getMileage());
		psmt.setInt(4, car.getCategory().getCategoryId());
		if(psmt.executeUpdate() != 1) {
			throw new DaoException("Not able to Add Car");
		}
	} catch (SQLException e) {
		throw new DaoException("Not able to Add Car", e);
	} finally {
		closeResource(psmt, con);
	}
	 
	}

	private int getNextCarID(Connection con) throws SQLException {
		String sql = "select Max(CAR_ID) from car";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql) ;
		if(rs.next()) {
			return rs.getInt(1) + 1;
		}
		return 1;
	}

	@Override
	public List<Category> getCategories() throws DaoException {
		 Connection con = null;
		 con = getConnection();
		 PreparedStatement psmt  = null;
		 List<Category> categoryList = new ArrayList<Category>();
		 try {
			psmt = con.prepareStatement(GET_CATEGORIES);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Category category = new Category();
				category.setCategoryId(rs.getInt("CAT_ID"));
				category.setName(rs.getString("name"));
				category.setDescription(rs.getString("description"));
				category.setCostPerKm(rs.getDouble("cost_Per_Km"));
				categoryList.add(category);
			}
		} catch (SQLException e) {
			throw new DaoException("Not able to get category List", e);
		} finally {
			closeResource(psmt, con);
		}
	 	return categoryList;
	}

}
