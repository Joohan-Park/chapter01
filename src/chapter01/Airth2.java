package chapter01;

import java.util.Objects;

public class Airth2 {
	public static void main(String[] args){
		int a = 7;
		int b = 3;
		
	/*	System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b && a > b);
		System.out.println(a !=b && a > b);
		System.out.println(a == b || a > b);
		System.out.println(a == b || a < b);*/
		int i=0;
		int i2=2;
		
		System.out.println(Integer.compare(i, i2));
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = "s1";
		Object obj4 = "s1";
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println(obj3.equals(obj4));
		System.out.println(obj4==obj3);
		
		String s1 = new String("1234");
		String s2 = new String("1234");
		String s3 = "asd";
		String s4 = "asd";		

		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	
	}
}
