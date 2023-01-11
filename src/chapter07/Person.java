package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	//기본 생성자 // heap memory
	
	public Person() {}
	
	public Person(String name, float height, float weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	} //method는 stack 메모리에

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
	
	

}
