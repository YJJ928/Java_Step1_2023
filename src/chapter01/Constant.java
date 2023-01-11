package chapter01;

public class Constant {

	public static void main(String[] args) {
		//상수: 변하지 않는 값
		
		final int MAX_NUM = 100;
		final int MIN_NUM; 
		final double PI = 3.14;
		MIN_NUM = 0;
		
		// MAX_NUM = 200; // 에러남, final은 한번 할당하면 다시 불가능
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
		

	}

}
