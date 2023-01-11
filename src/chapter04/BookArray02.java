package chapter04;

public class BookArray02 {

	public static void main(String[] args) {//main이 있어야만 실행 가능
		
		Book library[] = new Book[5]; //Book();을 5번 호출
		//다른 class에서 참조해서 가져옴
		
		library[0] = new Book("데미안","헤르만헤세");
		library[1] = new Book("책1","작가1");
		library[2] = new Book("책2","작가2");
		library[3] = new Book("책3","작가3");
		library[4] = new Book("책4","작가4");
		
//		library[0].showBookinfo();
//		library[1].showBookinfo();
//		library[2].showBookinfo();
//		library[3].showBookinfo();
//		library[4].showBookinfo();
//		library[0].showBookinfo();
		
		for(int i = 0 ; i < library.length ; i++) {
			library[i].showBookinfo();
			System.out.println();
		}
		
		
		
	}

}
