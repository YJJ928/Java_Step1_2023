package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		//선언방법
		
		int number1[] = new int[10]; 
		// int type의 첨자(배열방) 10개를 만들어서 number1 변수에 할당한다.
		int[] number2 = new int[10];
		
		int number3[];
		number3 = new int[10];
		
		//초기화(할당)
		int number4[] = new int[] {1,2,3,4,5,6,7,8,9,10}; //초기화(할당) 완료
		int number5[] = {1,2,3,4,5,6,7,8,9,10}; //초기화(할당) 완료
		
		for(int i = 0 ; i < number3.length ; i++) {
			System.out.println(number1[i] = (i+1)); //리터럴값을 대입한 후 print
			System.out.println(number4[i]);
		}
				
	}

}
