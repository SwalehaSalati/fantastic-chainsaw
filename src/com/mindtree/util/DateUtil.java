package com.mindtree.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mindtree.exception.ApplicationException;

public class DateUtil {

	public static Date getDateFromString(String strDate) throws ApplicationException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return sdf.parse(strDate);
		} catch (ParseException e) {
			 throw new ApplicationException("Invalid Date");
		}
	}
	 
}
