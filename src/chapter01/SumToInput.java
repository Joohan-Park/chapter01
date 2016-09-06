package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("더할숫자");
		int count = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= count; i++) {
			sum += i;
		}
		System.out.println("1부터" + count + "까지 합은" + sum + "입니다.");
		scanner.close();
	}
}