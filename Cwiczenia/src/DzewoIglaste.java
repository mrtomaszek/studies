
public class DzewoIglaste extends Drzewo {
	private int iloscIgiel;
	private double dlugoscSzyszki;

	public DzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
				int iloscIgiel, double dlugoscSzyszki) {
		super (wiecznieZielone, wysokosc, przekrojDrzewa);
		this.iloscIgiel = iloscIgiel;
		this.dlugoscSzyszki = dlugoscSzyszki;		
	}
	
	public String toString() {
		return "Czy nie gubi lisci: " + getWiecznieZielone() + "\nWysokosc: " + getWysokosc() 
				+ "\nPrzekroj drzewa: "	+ getPrzekrojDrzewa() + "\nIlosc igiel: " + iloscIgiel + "\nDlugosc szyszki: " + dlugoscSzyszki;
	}
	
}
