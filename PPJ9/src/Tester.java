
public class Tester {

	public static void main(String[] args) {
		Kwadrat kwadrat1 = new Kwadrat(5.0);
		System.out.println(kwadrat1.getObjetosc());
		System.out.println(kwadrat1.getPowierzchnia());
		kwadrat1.show();
		kwadrat1.WalecWKwadrat();
		
		Walec walec1 = new Walec(4.0, 8.0);
		System.out.println(walec1.getObjetoscWalca());
		System.out.println(walec1.getPowierzchniaPodstawy());
		walec1.show();
		
	}

}
