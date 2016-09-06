package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		while (true) {
			int divisor = 2;
			int num = stdin.nextInt();
			boolean isPrime = true;

			while (divisor <= (num / 2)) {
				if (num % divisor == 0) {
					isPrime = false;
					break;
				}
				divisor++;
			}
			
			if (isPrime) {
				System.out.println(num + "는 소수입니다.");
			} else
				System.out.println(num + "는 소수가 아닙니다.");
		}
	}
}
