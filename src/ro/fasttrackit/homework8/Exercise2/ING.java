package ro.fasttrackit.homework8.Exercise2;

public class ING implements Credit {
	private String company = "ING";
	private String userName;
	private int age;

	public ING(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	@Override
	public void depositMoney(int deposit) {
		if (age >= 18) {
			System.out.println(userName + " deposited " + deposit + " at bank " + company);
		}else{
			System.out.println(userName + " is not eligible for a deposit");
		}
	}

	@Override
	public void withdrawMoney(int withdraw) {
		if (age >= 18) {
			System.out.println(userName + " withdrawn " + withdraw + " from " + company);
		}else {
			System.out.println(userName + " is not eligible for a withdrawal");
		}
	}
}
