package ro.fasttrackit.homework8.Exercise1;

public class Facebook implements AdvertiseServices {
	private String profile;

	public Facebook(String profile) {
		this.profile = profile;
	}

	@Override
	public void send(String message) {
		System.out.println("Sending message: " + message + " to " + profile);
	}
}
