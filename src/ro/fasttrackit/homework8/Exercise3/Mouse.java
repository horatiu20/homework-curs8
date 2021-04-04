package ro.fasttrackit.homework8.Exercise3;

public class Mouse implements Animal {
	@Override
	public String walk() {
		return "mouse is walking";
	}

	@Override
	public String talk() {
		return "mouse says squeak-squeak";
	}

	@Override
	public String eat() {
		return "mouse is eating";
	}
}
