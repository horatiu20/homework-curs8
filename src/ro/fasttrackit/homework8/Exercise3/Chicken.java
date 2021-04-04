package ro.fasttrackit.homework8.Exercise3;

public class Chicken implements Animal {
	@Override
	public String walk() {
		return "chicken is walking";
	}

	@Override
	public String talk() {
		return "chicken says cluck-cluck";
	}

	@Override
	public String eat() {
		return "chicken is eating";
	}
}
