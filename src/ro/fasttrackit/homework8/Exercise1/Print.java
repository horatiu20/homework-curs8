package ro.fasttrackit.homework8.Exercise1;

public class Print implements AdvertiseServices {
	private String company;
	private String formatPage;

	public Print(String company, String formatPage) {
		this.company = company;
		this.formatPage = formatPage;
	}

	@Override
	public void send(String message) {
		System.out.println("Printing message: " + message + " at " + company + " on " + formatPage + " format");
	}
}
