package com.cdac.acts.Day17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;


public class String2Date {
	public static void main(String[] args) {
		// Define the DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Lambda for converting String to LocalDate
		Function<String, LocalDate> stringToLocalDate = dateString -> LocalDate.parse(dateString, formatter);

		// Lambda for converting LocalDate to String
		Function<LocalDate, String> localDateToString = localDate -> localDate.format(formatter);

		// Example usage
		String dateStr = "2023-10-01";
		LocalDate localDate = stringToLocalDate.apply(dateStr);
		System.out.println("Converted LocalDate: " + localDate);

		String convertedBack = localDateToString.apply(localDate);
		System.out.println("Converted back to String: " + convertedBack);
	}
}