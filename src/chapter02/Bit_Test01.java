package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		
		// Bit 연산
		
		int num1 = 5;  // 0101
		int num2 = 10; // 1010
					   // 1111(OR)
		
		//bit 연산 OR(|)
		
		int result = num1 | num2;
		System.out.println(result); //1111 -> 15
		
		
		//bit 연산 AND(&)
		
		result = num1 & num2;
		System.out.println(result); //0000 -> 0
		
		//bit 연산 XOR(^): 반대신호에는 1 출력 같으면 0
		
		result = num1 ^ num2;
		System.out.println(result); //1111 -> 15
				
		
		
	}

}
