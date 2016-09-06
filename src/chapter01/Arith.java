package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(b--);
		
		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);

		a++;
		System.out.println(a);
		
		System.out.println(a++);
		System.out.println(a);
	
		System.out.println(10/3);
		System.out.println(10./3.);
		System.out.println(10./3);
		System.out.println(10/3.);
		System.out.println((double)(10/3));
		
		System.out.println(44%3);
		System.out.println(-7%3);
		System.out.println(7%-3);
		
	}

}
