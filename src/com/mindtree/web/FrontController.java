package com.mindtree.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindtree.exception.ServiceException;
import com.mindtree.model.Car;
import com.mindtree.model.Category;
import com.mindtree.service.RentalService;
import com.mindtree.service.RentalServiceImpl;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 process(request, response);
	}

	private		 void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uri = request.getRequestURI();
		 String target = "index.jsp";
		 RentalService rentalService = new RentalServiceImpl();
		 if(uri.endsWith("carForm.do")){
			 try {
				request.setAttribute("categoryList", 
						rentalService.getAllCategories());
				target = "WEB-INF/jsp/carForm.jsp";
			} catch (ServiceException e) {
				e.printStackTrace();
				 request.setAttribute("msg", e.getMessage());
				 target = "index.jsp";
			}
		 } else if(uri.endsWith("rentalForm.do")){
			 try {
					request.setAttribute("carList", 
							rentalService.getCars());
					request.setAttribute("customerList", 
							rentalService.getCustomers());
					target = "WEB-INF/jsp/rentalForm.jsp";
				} catch (ServiceException e) {
					e.printStackTrace();
					 request.setAttribute("msg", e.getMessage());
					 target = "index.jsp";
				}
		 } else if( uri.endsWith("addCar.do")){
			 Car car = new Car();
			 populate(car,request);
			 try {
				rentalService.addCar(car);
				 request.setAttribute("msg", "Car succesfully added");
				 target = "index.jsp";
			} catch (ServiceException e) {
			 	e.printStackTrace();
			 	 request.setAttribute("msg", e.getMessage());
				 target = "index.jsp";
			}
		 }
		 RequestDispatcher dispatcher = request.getRequestDispatcher(target);
		 dispatcher.forward(request, response);
	}

	private void populate(Car car, HttpServletRequest request) {
	 Category category = new Category();
	 int catId = Integer.parseInt(request.getParameter("category"));
	 category.setCategoryId(catId);
	 car.setCategory(category);
	 car.setRegistrationNo(request.getParameter("registrationNo"));
	 car.setMileage(Double.parseDouble(request.getParameter("mileage")));
	}
}
