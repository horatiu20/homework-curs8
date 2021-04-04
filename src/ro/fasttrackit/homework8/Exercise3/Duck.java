package ro.fasttrackit.homework8.Exercise3;

public class Duck implements Animal {
	@Override
	public String walk() {
		return "duck is walking";
	}

	@Override
	public String talk() {
		return "duck says quack-quack";
	}

	@Override
	public String eat() {
		return "duck is eating";
	}
}
