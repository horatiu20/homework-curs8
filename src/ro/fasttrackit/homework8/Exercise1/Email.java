package ro.fasttrackit.homework8.Exercise1;

public class Email implements AdvertiseServices {
	private String email;

	public Email(String email) {
		this.email = email;
	}

	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message + " to " + email);
	}
}
