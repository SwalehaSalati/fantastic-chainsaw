/**
 * 
 */
package com.mindtree.dao.jdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mindtree.exception.DaoException;

/**
 * @author Banu Prakash
 * This code is for Modularity.
 * This class has a Code for Open and Close Resources
 * This is inherited by all Dao classes.
 * 
 */
public abstract class BaseDao {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	static {
		ResourceBundle resource = 
			ResourceBundle.getBundle("com.mindtree.dao.jdbcImpl.database");
		driver = resource.getString("driver");
		url = resource.getString("url");
		user = resource.getString("user");
		password = resource.getString("password");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
 			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws DaoException {
		try {
			return DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			throw new DaoException("Unable to get Connection", e);
		}
	}
	
	public void closeResource(final Statement stmt,final Connection con) 
									throws DaoException{
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				throw new DaoException("Unable to close statemet", e);
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new DaoException("Unable to close connection", e);
			}
		}
	}
	
}
