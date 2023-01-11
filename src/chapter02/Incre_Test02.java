package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		System.out.println("===============");
		System.out.println(x++); //10 -> 읽고 -> 11
		System.out.println(++x); //11 -> 12 -> 읽고
		
		System.out.println(x); //12
		
		System.out.println(y--); //10 -> 읽고 -> 9
		System.out.println(--y); //9 -> 8 -> 읽고
		System.out.println(y); //8
		
		System.out.println("===============");		
		System.out.println(y); //8
		
		System.out.println("===============");
		System.out.println("===============");		
		
		// z=++x z/x?
		z = ++x;
		System.out.println(x); //13
		System.out.println(y); //8
		System.out.println(z); //13
		
		// z=x++ z/x?
		z = x++;
		System.out.println(x); //14
		System.out.println(y); //8
		System.out.println(z); //13
		
		// z = ++x + y++ // z/x/y
		z = ++x + y++;
		System.out.println(x); //15
		System.out.println(y); //9
		System.out.println(z); //15 + 8 = 23
		
		
		

	}

}
