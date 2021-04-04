package ro.fasttrackit.homework8.Exercise2;

/* A person needs to take a credit.
There are several banks that provide this service: ING, BT, BRD.
The bank needs to provide the possibility to withdraw and deposit money. */

public interface Credit {
	void depositMoney(int deposit);

	void withdrawMoney(int withdraw);
}
