/* Write lambda for conversion from String to LocalDat and Vice Versa. Use Function<R, T> interface*
 */
package com.cdac.acts.Day17;

import java.time.LocalDate;
import java.util.function.Function;

public class DateConversion {

	public static void main(String[] args) {

//		LocalDate date = LocalDate.parse("2002-02-06");
		LocalDate date = LocalDate.of(2001, 12, 12);
		
		Function <LocalDate , String> datetoString = x -> x.toString();
		String datestr = datetoString.apply(date);
		System.out.println("LocalDate to String: " + datestr);
		
		Function <String, LocalDate> stringToDate = x -> LocalDate.parse(x);
		LocalDate date1 = stringToDate.apply(datestr);
		System.out.println("String to LocalDate: " + date1);
		
		
	}

}
