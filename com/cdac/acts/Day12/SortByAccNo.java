package com.cdac.acts.Day12;

import com.cdac.acts.Day12.Account;
import java.util.Comparator;

public class SortByAccNo implements Comparator<Account> {
	
	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getAccNo(),(o1.getAccNo()));
	}
}
