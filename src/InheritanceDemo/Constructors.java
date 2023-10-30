package InheritanceDemo;

public class Constructors {
	public  Constructors() {
		System.out.println("this is default constructor");
	}
	public  Constructors(int a) {
		System.out.println("this is parameterized constructor");
		System.out.println("the value of variable a :" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj =new Constructors();
		Constructors obj2 =new Constructors(10);
		
		//Creating a class
		
		class Dog {
			   String breed;
			   int age;
			   String color;

			   void barking() {
			   }
			   void hungry() {
			   }

			   void sleeping() {
			   }}


		

	}


}
