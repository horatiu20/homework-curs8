package ro.fasttrackit.homework8.Exercise2;

public class PersonCredit {
	private int deposit;
	private int withdraw;

	public PersonCredit(int deposit, int withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public void setDeposit(Credit newDeposit) {
		newDeposit.depositMoney(deposit);
	}

	public void setWithdraw(Credit newWithdraw) {
		newWithdraw.withdrawMoney(withdraw);
	}
}
