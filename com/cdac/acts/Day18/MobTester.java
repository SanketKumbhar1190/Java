package com.cdac.acts.Day18;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Stream API assignments
//1) Create MobilePhone  class with serialNo, brand, os, color, price, ram etc. Store in list and use 
//partitionedBy method to separate Android  and IOS phones.
//2) Use comparing and thenComparing methods to sort MobilePhones by color and weight
//3)	Convert the list of MobilePhones in set using Collect method.
//4)	Filter by every field
public class MobTester {

	public static void main(String[] args) {
		
		List<MobilePhone> phone = MobileUtil.getmobphone();
		
		Map<Boolean,List<MobilePhone>> partion = phone.stream()
				.collect(Collectors.partitioningBy((m)->m.getOS().equalsIgnoreCase("Android")));
		partion.get(true).forEach(System.out::println);
		partion.get(false).forEach(System.out::println);
		
		List<MobilePhone> phonecmpr = phone.stream()
				.sorted(Comparator.comparing(MobilePhone::getColor)
						.thenComparing(MobilePhone::getRam)
						 )
			    .collect(Collectors.toList());
		
		Set<MobilePhone> phoneSet = phone.stream()
			    .collect(Collectors.toSet());

			System.out.println("Converted Set:");
			phoneSet.forEach(System.out::println);
			
			// Filter by brand
			List<MobilePhone> applePhones = phone.stream()
			    .filter(p -> p.getBrand().equalsIgnoreCase("Apple"))
			    .collect(Collectors.toList());

			// Filter by OS
			List<MobilePhone> iosPhones = phone.stream()
			    .filter(p -> p.getOS().equalsIgnoreCase("IOS"))
			    .collect(Collectors.toList());

			// Filter by color
			List<MobilePhone> whitePhones = phone.stream()
			    .filter(p -> p.getColor().equalsIgnoreCase("White"))
			    .collect(Collectors.toList());

			// Filter by price > 70000
			List<MobilePhone> expensivePhones = phone.stream()
			    .filter(p -> p.getPrice() > 70000)
			    .collect(Collectors.toList());

			// Filter by RAM >= 8
			List<MobilePhone> highRamPhones = phone.stream()
			    .filter(p -> p.getRam() >= 8)
			    .collect(Collectors.toList());		
	}
}
