package chapter05;

public class FunTest08 {
	//멤버변수(필드)
	
	//디폴트 생성자
			
	//메소드: 재귀함수
	
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		
		if(a==1) {
			return(1);
		} else {
			result = a*Recur(a-1);
		}
		
//		return (1); //정상종료는 아니지만 오류가 없이 끝남. 
//		return 0; //정상종료되었으나 넘어갈 값이 없음.
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		int res = Recur(x);
		System.out.println();
		System.out.println("메소드 호출");
	 	System.out.println(x+"! = "+res);
		System.out.println();
	
	}

}
