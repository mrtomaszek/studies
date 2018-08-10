
public class Rakieta {

	String nazwa;
	int wagaPaliwa;

	public Rakieta(String nazwa, int wagaPaliwa) {
		this.nazwa = nazwa;
		this.wagaPaliwa = wagaPaliwa;

	}

	public String getName() {
		return nazwa;
	}

	public void zatankuj() {
		wagaPaliwa = (int) (2000 * Math.random());
	}

	

	public void start() throws Exception {
		System.out.println(wagaPaliwa);
		if (wagaPaliwa < 1000)
			throw new Exception("start anulowany - z malo paliwa");
		else
			System.out.println("polecial w kosmos " + nazwa);
	}
}
