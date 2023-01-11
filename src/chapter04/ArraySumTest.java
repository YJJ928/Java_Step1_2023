package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		
		int score[] = {98, 90, 87};
		
		int sum = 0;
		
		
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
			System.out.println(score[i]);
		}
		double avg = sum/(double)score.length;
		System.out.println("총점 : "+ sum + "점");
		System.out.println("총점 : "+ (double)Math.round(avg*100)/100 + "점");
		System.out.println("총점 : "+ String.format("%.2f", avg) + "점");
		
	}

}
