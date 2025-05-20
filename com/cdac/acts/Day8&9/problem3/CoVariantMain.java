package com.cdac.acts.Day8&9.problem3;
//import com.cdac.acts.problem3.CoVariantReturn;
public class CoVariantMain {
	public static void main(String[] args) {
		Number a =3;
		Number b =4;
		CoVariant c = new CoVariantReturn();
		Number d = c.add(a, b);
		System.out.println(d);
	}
	
}
