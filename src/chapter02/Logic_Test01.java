package chapter02;

public class Logic_Test01 {

	public static void main(String[] args) {
		// and && ampersand
		// or || :인더기븐??
		// not !
		
		char a, b;
		boolean c;
		a = 'A';
		b = 'B';
		
		c= (true || true) && false; //c = true && false
		System.out.println(c); //false
		
		c=a<b && (a==b); //F
		System.out.println(c);
		
		c = a<b || (a==b);
		System.out.println(c); //T
		
		
	}

}
