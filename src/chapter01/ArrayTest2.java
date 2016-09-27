package chapter01;

public class ArrayTest2 {

	//객체를 저장하는 배열 vs 기본타입을 저장하는 배열
	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		
		books[0]=new Book();
		
		books[0].isbn = "parkjoohan";
		books[0].price = 20000;
		books[0].title = "자바의정석";
		
		System.out.println(books[0].isbn+"\n"+books[0].price+"\n"+books[0].title);
		
	}

}
