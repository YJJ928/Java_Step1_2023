package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균 구하기
//		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
//		int sum = 0;
//		double avg = 0;
//		int total = 0;
//		int count = 0, cnt = 0;
//		double alltotal = 0, allavg = 0;
				
//		for(int i = 0 ; i < array.length ; i++) {
//			sum = 0;
//			for(int j = 0 ; j < array[i].length ; j++) {
//				sum += array[i][j];
//				total = sum;
//				count++;
//				avg = (total/(double)array[i].length);
//			}
//			System.out.print((i+1)+"행 합계 : "+total+"\t");
//			System.out.print((i+1)+"행 평균 : "+avg+"\n");
//			alltotal += total;
//			allavg +=avg;
//			cnt++;
//		} System.out.println();
//		System.out.print("전체합계 : "+alltotal+",  전체평균 : "+ (alltotal/(double)count)+"\n");
//		System.out.print("전체합계 : "+alltotal+",  전체평균 : "+ String.format("%.2f", (allavg/cnt)));
		
//		for(int i = 0 ; i < array.length ; i++) {
//			sum = 0;
//			count = 0;
//			for(int j = 0 ; j < array[i].length ; j++) {
//				sum += array[i][j];
//				total = sum;
//				count++;
//				avg = (total/(double)count);
//			}
//			System.out.print((i+1)+"행 합계 : "+total+"\t");
//			System.out.print((i+1)+"행 평균 : "+avg+"\n");
//		}
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int total = 0;
		int count = 0;
		
//		for(int[] num : array) { //95, 86
//			total = 0;
//			for(int score : num) {
//				total += score;
//			}  
//			count++;
//			System.out.print(total+"\t");
//			System.out.print(count+"\n");
//			
//		}
		
		
		for(int[] num : array) {
			total = 0;
			for(int i = 0; i<num.length ; i++) {
				System.out.print(num[i]+" ");
			}
			for(int score : num) {
				System.out.println(score);
				total += score;
				System.out.println(total);
			} count++;
			System.out.println();
			System.out.println(total+"\t");
			System.out.println(count+"\n");
		}
		
//		for(int score : num) {
//			total += score;
//		}  
//			count++;
//			System.out.print(total+"\t");
//			System.out.print(count+"\n");
		
		String a[] = new String[3];
//		a[0] = {"dd"};
//		a[1] = {"ee"}; 
//		a[2] = {"cc"};
//		a[] = {"dd","ee","cc"};
		
		//System.out.println(a);
		
		
			
	}

}
