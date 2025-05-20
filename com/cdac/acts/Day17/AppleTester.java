package com.cdac.acts.Day17;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1) Create Apple class with weight, color and taste. Use Stream API for below things. Use method ref for println
//1.     Filter by weight
//2.     filter by color
//3.     filter by color and weight
//4.     filter by color, weight and taste
//5.     Sort by weight
//6.     Sort by color
//7.     Remove red apples
//8.     Removed Green apples
//9.     Convert to Set collection
public class AppleTester {

	public static void main(String[] args) {

		List<Apple> applesList = AppleUtils.getAppleList();
		List<Apple> applesList1 = AppleUtils.getAppleList();

		List<Apple> filterlist = applesList.stream()
				.filter(a->a.getWeight()>150)
				.collect(Collectors.toList());
		filterlist.forEach(System.out::println);

		System.out.println("******************************************");

		Set<Apple> filterList1 = applesList.stream()
				.filter(a->a.getColor().equalsIgnoreCase("Red") )
				.collect(Collectors.toSet());
		filterList1.forEach(System.out::println);

		System.out.println("******************************************");

		List<Apple> filterlist2 = applesList.stream()
				.filter(a->a.getWeight()>150 && a.getColor().equalsIgnoreCase("Red"))
				.collect(Collectors.toList());
		filterlist2.forEach(System.out::println);

		System.out.println("******************************************");

		List<Apple> filterlist5 = applesList.stream()
				.filter(a->a.getWeight()>150 && a.getColor().equalsIgnoreCase("Red") && a.getTaste().equalsIgnoreCase("Sweet"))
				.collect(Collectors.toList());
		filterlist5.forEach(System.out::println);

		System.out.println("******************************************");

		List<Apple> filterList3 = applesList.stream()
				.sorted((a1, a2)-> a1.getWeight().compareTo(a2.getWeight()))
				.collect(Collectors.toList());
		filterList3.forEach(System.out::println);

		System.out.println("******************************************");

		List<Apple> filterList4 = applesList.stream()
				.sorted((a1, a2)-> a1.getColor().compareTo(a2.getColor()))
				.collect(Collectors.toList());
		filterList4.forEach(System.out::println);

		System.out.println("******************************************");

		//		List<Apple> filterList6;
		applesList.removeIf((s)-> s.getColor().equals("Red"));
		applesList.forEach(System.out::println);

		System.out.println("******************************************");

		applesList1.removeIf((s)-> s.getColor().equals("Green"));
		applesList1.forEach(System.out::println);

		System.out.println("******************************************");

		Set<Apple> filterList7 = applesList.stream()
				.collect(Collectors.toSet());
		filterList7.forEach(System.out::println);

	}	
}

