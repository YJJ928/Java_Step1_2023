package chapter05;

public class FunTest_Overloading {
	
	//필드 = 멤버변수
	
	//생성자(디폴트 생략)
	
	//다형성을 만족 
	
	//overloading : method명 통일성 있게 사용해야 하는 경우 메소드의 매개변수의 종류와 개수를 다르게 
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다." );
	}
	public void getResult(String n) {
		System.out.println(n + "은(는) String입니다." );
	}
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다." );
	}
	public void getResult(int n, String str) {
		System.out.println(n +", "+str+ "은(는) Int, String 입니다." );
	}
	
	
}
