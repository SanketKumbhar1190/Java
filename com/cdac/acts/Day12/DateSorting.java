package com.cdac.acts.Day12;

import java.util.Comparator;

public class DateSorting implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getDateOfOpening().compareTo(o2.getDateOfOpening());
	}

}
