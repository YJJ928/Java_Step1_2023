package chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		int f = 6;
//		
//		System.out.println(a+b+c+d+e+f);
		
		//배열선언1
		int a[] = new int[5]; //5개의 배열을 넣겠다. fixed-length
		//배열선언2
		int b[]; // 갯수가 결정되지 않은 배열 선언
		b = new int[5]; //배열갯수 할당
		
		int aVal;
		int bVal;
		int tot;
				
		args = new String[2];
		args[0] = "1"; //args의 배열방의 0번째 순서에 1값이 들어있다.
		args[1] = "2"; //args의 배열방의 1번째 순서에 2값이 들어있다.
		
		String[] str; // str변수명을 가진 String type의 배열 / String str[]도 상관없다
		str = new String[10];
		
		// length //배열의 첨자(메모리) 수 
		if(args.length == 2) {
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[1]);
		} else {
			aVal = 0;
			bVal = 0;
		}
		tot = aVal + bVal;
		System.out.println(tot);
	} //main

} //class
