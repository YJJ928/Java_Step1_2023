package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		//1
		Person ps = new Person();
		ps.name = "아아아";
		ps.height = 1.55f;
		ps.weight = 55.5f;
		System.out.println(ps.name);
		System.out.println(ps.height);
		System.out.println(ps.weight);
		System.out.println("----------");
		//2
		Person ps2 = new Person("하하하", 4.44f, 44.4f);
		System.out.println(ps2.getName());
		System.out.println(ps2.getHeight());
		System.out.println(ps2.getWeight());
		//3
		Person ps3 = new Person();
		
		
		
		

	}

}
