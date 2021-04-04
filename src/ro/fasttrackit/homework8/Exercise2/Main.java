package ro.fasttrackit.homework8.Exercise2;

// m-am gandit sa pun o conditie pentru a putea scoate/depozita bani: varsta.
// se mai pot pune si alte conditii: daca lucreaza, daca are o anumita suma in cont, etc.

public class Main {
	public static void main(String[] args) {

		PersonCredit person = new PersonCredit(500, 100);

		person.setDeposit((new ING("Horatiu", 35)));
		person.setWithdraw((new ING("Horatiu", 35)));

		person.setDeposit((new BRD("Laura", 5)));
		person.setWithdraw((new BRD("Laura", 5)));

		person.setDeposit((new BT("Bianca", 27)));
		person.setWithdraw((new BT("Bianca", 27)));
	}
}
