package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 10;
		
		if(n2>n1){
			int a=0;
			a=n1;
			n1=n2;
			n2=a;
		}
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
	
		int a1=80;
		int a2=70;
		int a3=90;
		int max=0;
		
		if(a1>=a2){
			max=a1;
			if(max<a3){
				max=a3;
			}
		}
		else{
			max=a2;
			if(max<a3){
				max=a3;
			}
		}
		
		
		System.out.println("최대값은="+max);
	}

}
