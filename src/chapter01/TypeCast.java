package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		
		//implicity(암시적) type casting
		int i = 10;
		long l = i;
		
		//explicity(명시적) type casting
		long l2 = 9110161560310L;
		String S = "010-3551-4188";
		int i2 = (int)l2;
		System.out.println(i+":"+l);
		System.out.println(i2+":"+l2);
		System.out.println(S);
	}

}
