package chapter02;

public class Test {

	public static void main(String[] args) {
		//Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현
		byte aa = 1;
		int ab = aa;
		System.out.println(ab);
		
		var ac = "sdf";
		System.out.println(ac);
		
		//Q2 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현
		double ba = 2.0;
		int bb = (int)ba;
		System.out.println(bb);
		
		var bc = 4.5;
		int bd = (int)bc;	
		System.out.println(bd);
		
		//Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식(-->부동소수점방식) 
		
		//Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		int da = 10;
		float db = 2.5f;
		System.out.println("덧 셈 : " + (int)(da+db));
		System.out.println("뺄 셈 : " + (int)(da-db));
		System.out.println("나눗셈 : " + (int)(da/db));
		System.out.println("곱 셈 : " + (int)(da*db));
		System.out.println("나머지 : " + (int)(da%db));
		
		//Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
		char ea = '\uAE00';
		System.out.println(ea);
	}

}
