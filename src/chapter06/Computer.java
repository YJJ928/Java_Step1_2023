package chapter06;

public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i = 0 ; i < values.length ; i++) {
			sum+=values[i];
		}
		return sum; //void가 아니어서 return 필요..
	}
	
	
	int sum2(int ... values) {
		int sum = 0;
		
		for(int i = 0 ; i < values.length ; i++) {
			sum+=values[i];
		} //for
		return sum;
	} //method
	
}
