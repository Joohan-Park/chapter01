package chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {
//		for(;;){
//			
//		}
		
		int i = 0;
		int sum = 0;
		while(true){
			sum+=i;
			
			if(i>1000){
				break;
			}
			i++;
		}
		System.out.println(sum);

	}

}
