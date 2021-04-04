package ro.fasttrackit.homework8.Exercise1;

public class Advertisement {
	private String[] message;

	public Advertisement(String[] message) {
		this.message = message;
	}

	public void setMessage(AdvertiseServices platform) {
		for (String all : message) {
			platform.send(all);
		}
	}
}
