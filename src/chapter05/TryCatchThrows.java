package chapter05;

public class TryCatchThrows {

	public static void fun() throws Exception{ //throws
		
		try { //정상코드
			System.out.println("fun()메서드");
			throw new Exception(); //위에 throws랑 세트 
			//오류 있으면 catch 건너뛰고 아래 main으로 간다....?
			
		} catch (RuntimeException e) { //runtimeexception: 실행중 발생하는 에러
			//에러시 수행코드
			System.out.println("예외발생");
		} finally { //에러를 잡지 못해도 잡아도 무조건 수행
			System.out.println("finally문장"); //finally는 무조건 읽는다.
		}
		
	}
	
	
	public static void main(String[] args) {
		//static이므로 바로 호출 가능하지만, throw exception때문에 try catch로 호출
//		fun(); //에러남 
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}


	} //예상치 못한 에러는 try catch 문을 사용한다. 

}
