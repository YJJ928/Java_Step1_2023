package chapter04;

public class TwoDemension01 {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][3]; //2행 3열
		// 000 1행3열
		// 000 2행3열
		int n = 0;
		
		for(int i = 0 ; i < arr.length ; i++) { //arr.length = 2 (행 수)
			for(int j=0 ; j < arr[i].length; j++) { //arr[i].length = 3 (열 수)
				n++;
				System.out.print((arr[i][j] = n)+" ");
			}System.out.println();
			
		}System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3
		
		int arr1[][] = {{1,2,3},{4,5,6}};
		n = 0;
		
		for(int i = 0 ; i <arr1.length ; i++) {
			for(int j = 0 ; j < arr1[0].length ; j++) {
				n++;
				System.out.print((arr1[i][j] = n)+" ");
			}
			System.out.println();
		}
		
	}

}
