package ppj11;


public class Test{

	public static void main(String[] args) {
		
		Owoc owoc = new Owoc("Zielony", 4);
		
		System.out.println(owoc.toString());
		
		Dzem dzem1 = new Dzem("truskawkowy", 0.5);
		Dzem dzem2 = new Dzem("pomaranczowy", 0.5);
		Dzem dzem3 = new Dzem("wisniowy", 0.5);
		System.out.println(dzem1.pokazDzem());
		System.out.println(dzem2.pokazDzem());
		System.out.println(dzem3.pokazDzem());
	}

}
