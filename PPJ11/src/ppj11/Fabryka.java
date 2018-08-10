package ppj11;

public class Fabryka {

	
	private double wagaOwocow = 0;

	public Fabryka() {

	}

	public void przyjmij(Owoc owoc) {
		wagaOwocow += owoc.wagaOwocu();
	}

	public Sloik[] zrobDzem() {
		if (wagaOwocow >= 10) {
			Sloik[] sloiki = new Sloik[10];
			Dzem dzem = new Dzem("truskawkowy", 1.0);
			for (int i = 0; i < 10; i++) {
				sloiki[i].addDzem(dzem);
				sloiki[i].zamknij();
			}
			return sloiki;
		} else
			return null;
	}
}
