/**
 * 
 */
package com.mindtree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Banu Prakash
 *
 */
public class Rental implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4494589428451007317L;
	private int rentalId;
	private Customer customer;
	private Car car;
	private Date hireDate;
	private Date returnDate;
	private double totalKms;
	/**
	 * @return the rentalId
	 */
	public int getRentalId() {
		return rentalId;
	}
	/**
	 * @param rentalId the rentalId to set
	 */
	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the returnDate
	 */
	public Date getReturnDate() {
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	/**
	 * @return the totalKms
	 */
	public double getTotalKms() {
		return totalKms;
	}
	/**
	 * @param totalKms the totalKms to set
	 */
	public void setTotalKms(double totalKms) {
		this.totalKms = totalKms;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + rentalId;
		result = prime * result
				+ ((returnDate == null) ? 0 : returnDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalKms);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rental other = (Rental) obj;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (rentalId != other.rentalId)
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (Double.doubleToLongBits(totalKms) != Double
				.doubleToLongBits(other.totalKms))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rental [car=" + car + ", customer=" + customer + ", hireDate="
				+ hireDate + ", rentalId=" + rentalId + ", returnDate="
				+ returnDate + ", totalKms=" + totalKms + "]";
	}
	
}
