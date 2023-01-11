package chapter01;

public class DoubleEx2 {

	public static void main(String[] args) {
		
		//정수(int; 4byte)와 실수(float; 4byte) 연산 시 float
		//더 정밀한 수로 자동 형변환이 됨 (묵시적 형변환)
		
		int aVal = 10;
		float bVal = 10.5f;
		
		//int sVal = aVal + bVal; 에러남..
		float sVal = aVal + bVal;
		System.out.println("aVal + bVal : " + (aVal + bVal));
		System.out.println(sVal);
	

	}

}
