package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1 = 123456789; //4byte = 32bit
		//long num2 = 12345678900; 에러남
		long num2 = 12345678900L;//8byte = 64bit
		long num3 = 1000; //L안썼어도 에러안남->
		//long형의 64bit지만 L로 선언 안해서 자동으로 int로 인식해서 그럼
		
		int level; // 선언o. 초기화x
		level = 10; // 초기화 작업 --> 리터널 값
		
		System.out.println(num2+num3); // 결과값 long으로 인식함(큰수를 따라감)
		System.out.println(level);
		
	}

}
