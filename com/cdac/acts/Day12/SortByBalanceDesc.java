package com.cdac.acts.Day12;

import java.util.Comparator;

public class SortByBalanceDesc implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
//		return Integer.compare(o2.getBalance(), o1.getBalance());
		return Integer.compare(o1.getBalance(),o2.getBalance());
	}


}
