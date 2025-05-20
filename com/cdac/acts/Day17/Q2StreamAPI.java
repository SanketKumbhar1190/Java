package com.cdac.acts.Day17;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//2) create list of String and use Stream API for below ( use method ref for println
//1.     print distinct
//2.     print all with uppercase
//3.     print which starts with specific letter
//4.     concat all strings in the list
//5.     filter by ending with some text

public class Q2StreamAPI {

	public static void main(String[] args) {

		List<Apple> appleslist = AppleUtils.getAppleList();
		List<Apple> distinct1 = appleslist.stream()
				.distinct()
				.collect(Collectors.toList());
		distinct1.forEach(System.out::println);

		//		String appleslist1 = appleslist.toString()
		//				.toUpperCase();
		//		System.out.println(appleslist1);

		List<String> toupprcase = appleslist.stream()
				.map(Apple::toString)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		toupprcase.forEach(System.out::println);

		// 3. Print apples which have color starting with 'R'
		System.out.println("\nApples with color starting with 'R':");
//		appleslist.stream()
		List<Apple> startsome = appleslist.stream()
		.filter(a -> a.getColor().startsWith("R"))
		.collect(Collectors.toList());
		startsome.forEach(System.out::println);

		// 4. Concatenate all apple toString values into one string
		System.out.println("\nConcatenated apple descriptions:");
		String concatenated = appleslist.stream()
				.map(Apple::toString)
				.collect(Collectors.joining(" | "));
		System.out.println(concatenated);

		// 5. Filter apples where taste ends with "t"
		System.out.println("\nApples with taste ending with 't':");
		appleslist.stream()
		.filter(apple -> apple.getTaste().endsWith("t"))
		.forEach(System.out::println);
	}
}

