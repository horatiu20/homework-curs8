package ro.fasttrackit.homework8.Exercise3;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Cat();
		System.out.println(animal.walk());
		System.out.println(animal.talk());
		System.out.println(animal.eat());
		animal = new Chicken();
		System.out.println(animal.walk());
		System.out.println(animal.talk());
		System.out.println(animal.eat());
		animal = new Dog();
		System.out.println(animal.walk());
		System.out.println(animal.talk());
		System.out.println(animal.eat());
		animal = new Duck();
		System.out.println(animal.walk());
		System.out.println(animal.talk());
		System.out.println(animal.eat());
		animal = new Mouse();
		System.out.println(animal.walk());
		System.out.println(animal.talk());
		System.out.println(animal.eat());
	}
}
