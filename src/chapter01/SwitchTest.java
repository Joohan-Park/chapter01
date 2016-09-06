package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 10;
		int days = 0;
		
		if(month == 2){
			days = 28;
		}else if((month==4)||(month==6)||(month==9)||(month==11)){
			days=30;
		}else{
			days=31;
		}
		System.out.println(month+"월은"+days+"일까지 있습니다.");
		
		
		month=2;
		switch(month){
			case 2:
				days =28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
		default:
			days=31;
			break;
		}
		System.out.println(month+"월은"+days+"일까지 있습니다.");
		
		String s1=new String("hello");
		String s2=new String("hello");
		
		
		if(s1==s2){
			System.out.println("1");
		}
	}
}
