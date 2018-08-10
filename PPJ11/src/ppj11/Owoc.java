package ppj11;


public
	class Owoc {
	
	private String kolor;
	private int iloscPestek;
	private double waga;
	
	public Owoc(String kolor, int iloscPestek){
		this.kolor = kolor;
		this.iloscPestek = iloscPestek;
		this.waga = (double)(Math.random() * (0.8 - 0.5)) + 0.5;
		//System.out.println(this);
	}
	
	public double wagaOwocu(){
		return waga;
	}

	public String toString(){
		return "Owoc ->\n\tkolor: "+kolor+
				"\n\tiloscPestek: "+iloscPestek+
				"\n\twaga: " +waga;
	}

}

