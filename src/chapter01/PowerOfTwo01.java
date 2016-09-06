package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int result = 1;
		System.out.print("승수:");
		int pow = scanner.nextInt();
		
		while(i<pow){
			result *= 2;
			i++;
		}
		
		System.out.println("2의" + pow +"제곱근은"+result+"입니다.");
		scanner.close();	

	}

}
