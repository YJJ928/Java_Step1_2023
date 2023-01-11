package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		//bookArray1 배열 3개 선언
		Book bookArray1[] = new Book[3];
		Book bookArray2[] = new Book[3];
		
		//초기화
		bookArray1[0] = new Book("데미안", "헤르만 헤세");
		bookArray1[1] = new Book("빨간머리앤", "몽고메리");
		bookArray1[2] = new Book("백설공주", "그림형제");
		
		//출력
		System.out.println("array1");
		for(int i = 0 ; i < bookArray1.length ; i++) {
			bookArray1[i].showBookinfo();
		}
		
		//복사 (array1 -> array2)
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//복사본 출력
		System.out.println("array2");
		for(int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBookinfo();
		}
				
		System.out.println();
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===========");
		System.out.println("array1");
		for(int i = 0 ; i < bookArray1.length ; i++) {
			bookArray1[i].showBookinfo();
		}
		
		//복사 (array1 -> array2) //얕은복사
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		//copy가 아니라 같은곳을 바라보도록 한것....?
		
		//복사본 출력
		System.out.println("array2");
		for(int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBookinfo();
		}//복사본도 바뀜을 알 수 있다, 얕은복사?
		//
		
		
		
	}

}
