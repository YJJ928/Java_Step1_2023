package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		// 깊은복사
		Book bookArray1[] = new Book[3];
		Book bookArray2[] = new Book[3];
		
		//초기화
		bookArray1[0] = new Book("데미안", "헤르만 헤세");
		bookArray1[1] = new Book("빨간머리앤", "몽고메리");
		bookArray1[2] = new Book("백설공주", "그림형제");
		
		//객체생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
				
		System.out.println("array1");
		for(int i = 0 ; i < bookArray1.length ; i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println("array2");
		for(int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBookinfo();		
		}
				
		for(int i = 0 ; i < bookArray1.length ; i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}//깊은복사
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		//bookArray1[0]바꾸기
		
		System.out.println("===========");	
				
		System.out.println("array1");
		for(int i = 0 ; i < bookArray1.length ; i++) {
			bookArray1[i].showBookinfo();
		}
					
		System.out.println("array2");
		for(int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBookinfo();
		}//깊은복사는 바뀌지 않는다
					
	}

}
