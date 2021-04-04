package ro.fasttrackit.homework8.Exercise3;

public class Cat implements Animal {
	@Override
	public String walk() {
		return "cat is walking";
	}

	@Override
	public String talk() {
		return "cat says miau-miau";
	}

	@Override
	public String eat() {
		return "cat is eating";
	}
}
