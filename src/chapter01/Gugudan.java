package chapter01;

public class Gugudan {

	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
