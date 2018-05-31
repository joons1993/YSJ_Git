package Chapter5;
class Person {
	int age;
	String name;
	int height;
	int weight;
	
public Person() {
	
}
public Person(int age) {
	this.age = age;
}
public Person(String name) {
	this.name = name;
}
public Person(int height, int weight) {
	this.height = height;
	this.weight = weight;
}

public class ConstructorTest {
	/*
	 * 생성자 테스트
	 */
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		System.out.println("person1.name = " +person1.name+",person1.height =" +person1.height+",person1.weight =" +person1.weight+
				",person1.age = " +person1.age);
		Person person2 = new Person(30);
		System.out.println("person2.name = " +person2.name+",person2.height =" +person2.height+",person2.weight =" +person2.weight+
				",person2.age = " +person2.age);
		
		Person person3 = new Person("goodman");
		System.out.println("person3.name = " +person3.name+",person3.height =" +person3.height+",person3.weight =" +person3.weight+
				",person3.age = " +person3.age);
		

	}

}
