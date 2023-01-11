package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean kr1 = new Korean("박자바", "010-2222-2222");
		System.out.println(kr1.name);
		System.out.println(kr1.nation);
		System.out.println(kr1.ssn);
		System.out.println("-----------");
		
		Korean kr2 = new Korean("김김김", "010-1111-1111");
		System.out.println(kr2.name);
		System.out.println(kr2.nation);
		System.out.println(kr2.ssn);
	}

}
