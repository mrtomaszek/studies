
public class Drzewo {

	private boolean wiecznieZielone;
	private int wysokosc;
	private String przekrojDrzewa;

	public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
		this.wiecznieZielone = wiecznieZielone;
		this.wysokosc = wysokosc;
		this.przekrojDrzewa = przekrojDrzewa;
	}
	public boolean getWiecznieZielone(){
		return wiecznieZielone;
	}
	public int getWysokosc(){
		return wysokosc;
	}
	public String getPrzekrojDrzewa(){
		return przekrojDrzewa;
	}
	public String toString() {
		return "Czy nie gubi lisci: " + wiecznieZielone + "\nWysokosc: " + wysokosc 
				+ "\nPrzekroj drzewa: "	+ przekrojDrzewa;
	}
}
