package ro.fasttrackit.homework8.Exercise3;

public class Dog implements Animal {
	@Override
	public String walk() {
		return "dog is walking";
	}

	@Override
	public String talk() {
		return "dog says wof-wof";
	}

	@Override
	public String eat() {
		return "dog is eating";
	}
}
