package com.cdac.acts.Day18;

import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.Day17.Apple;

public class MobileUtil {
//	public MobilePhone(String serialNo, String brand, String oS, String color, int price, int ram) {
	public static List<MobilePhone> getmobphone() {
	    List<MobilePhone> mobph = new ArrayList<>();
	    mobph.add(new MobilePhone("abc123", "Apple", "IOS", "White", 90000, 7));
	    mobph.add(new MobilePhone("xyz456", "Samsung", "Android", "Black", 75000, 8));
	    mobph.add(new MobilePhone("mno789", "Google", "Android", "Gray", 68000, 6));
	    mobph.add(new MobilePhone("def321", "Apple", "IOS", "Blue", 95000, 9));
	    mobph.add(new MobilePhone("ghi654", "OnePlus", "Android", "Red", 72000, 7));
	    mobph.add(new MobilePhone("jkl987", "Apple", "IOS", "Silver", 88000, 8));
	    mobph.add(new MobilePhone("uvw111", "Samsung", "Android", "Green", 70000, 6));
	    mobph.add(new MobilePhone("rst222", "Apple", "IOS", "Black", 91000, 9));
	    mobph.add(new MobilePhone("opq333", "Motorola", "Android", "White", 60000, 7));
	    mobph.add(new MobilePhone("bcd444", "Apple", "IOS", "Gold", 97000, 10));
	    return mobph;
	}
}

