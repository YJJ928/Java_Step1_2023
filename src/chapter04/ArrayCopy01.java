package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		
		for (int i = 0 ; i < array1.length ; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		//배열 복사
		//(array1, 첨자(복사가 시작될 위치 첨자), array2, 첨자(복사 붙여넣기할 시작 위치 첨자), 붙여넣기 원소개수)
		
		System.arraycopy(array1, 1, array2, 2, 3); 
		// array1을 array2에 복사한다
		// 1번방부터(20) 복사해서, 2번째에(3), 3개를 붙일게(20,30,40)
		
		for (int i = 0 ; i < array1.length ; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		int a[] = {1,2,3,4,5,6,7};
		int b[] = new int[7];
		System.arraycopy(a, 0, b, 0, 7);

	}

}
