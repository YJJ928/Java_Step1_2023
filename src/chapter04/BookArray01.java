package chapter04;

import java.util.Scanner;

public class BookArray01 {

	public static void main(String[] args) {
		
		//Book bk = new Book();
		
		Book[] bk = new Book[5];
		//Book bk = new Book();가 5개 있는거임
		
		//bk.getBookname();
		//bk.setAuthor(null);
		
		for (int i = 0 ; i < bk.length ; i++) {
			System.out.println(bk[i]);
		}

	}

}
