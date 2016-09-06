package chapter01;
import java.util.Scanner;

public class Nhellowrold01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("횟수입력>");
		int count = scanner.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=count){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		scanner.close();


	}

}