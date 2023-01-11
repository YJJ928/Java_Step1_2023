package chapter03.IF;

class clsA {
	
	void fun() {
		
		System.out.println("2023년 1월 첫째주 월요일 입니다.");
		
	} // void: return 되는 타입이 없음을 의미합니다. 즉 아무것도 리턴하지 않음을 선언
	
} //내부 class 만듦

class clsB extends clsA {
	
}
//clsB(자식)가 clsA(부모)를 포함하고 있다. 부모의 메소드를 그대로 사용할 수 있으며 오버라이딩 할 필요 없이 부모에 구현되있는 것을 직접 사용 가능하다.
//부모에서 선언 / 정의를 모두하며 자식은 메소드 / 변수를 그대로 사용할 수 있음


public class InsTest {

	public static void main(String[] args) {
		
		//clsB의 인스턴스 변수를 만들자
		clsB objB = new clsB(); //공간만 만들어줌
		
		if(objB instanceof clsA) { //clsB에 clsA가 포함되어 있다면, 
			
			System.out.println("Yes");
			objB.fun();
			
		}//if
		
		if(objB instanceof clsB) {
			
			System.out.println("Yes");
			
		} //if
			
	} //main

}//instance의 class
