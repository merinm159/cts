package com.cognizant.truyum.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
	public  Date convertToDate(String date) throws ParseException {
//		Date date1=null;
		
		Date	date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);

		return date1;
	}

}
