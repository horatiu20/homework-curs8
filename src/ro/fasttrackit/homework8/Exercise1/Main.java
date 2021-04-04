package ro.fasttrackit.homework8.Exercise1;

public class Main {
	public static void main(String[] args) {
		String[] message = {"Join our network", "We have cookies"};

		Advertisement advertisement = new Advertisement((message));

		advertisement.setMessage((new Facebook("Horatiu Pacurar")));
		advertisement.setMessage((new Email("horatiupacurar20@gmail.com")));
		advertisement.setMessage((new Print("PrintShop", "A0")));
	}
}
