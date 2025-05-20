package com.cdac.acts.Day12;

import com.cdac.acts.Day12.Account;
import java.util.Comparator;
@SuppressWarnings("unused")
public class SortByAccName implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getAccName().compareTo(o2.getAccName());

	}
//
////	@Override
////	public int compare(Account o1, Account o2) {
////		// TODO Auto-generated method stub
////		return o1.getAccName().compareTo(o2.getAccName());
////	}
//
//	
}
