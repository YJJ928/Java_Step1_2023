package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		//생성자 통하여 초기화
//		car.color = "블랙";
//		car.cc = 2000;
		
		Car car = new Car("블랙", 2000);
		car.cc = 3000;
		car.color = "블루";
		
		//멤버변수에 직접 접근해서 초기화 후 출력
		System.out.println("컬러: "+car.color);
		System.out.println("배기량: "+car.cc);
		
		System.out.println("-------------------");
		
		//method를 이용하여 출력
		System.out.println("컬러: "+car.getColor());
		System.out.println("배기량: "+car.getCc());
		
		System.out.println("-------------------");
		
		
	}

}
