
public class DrzewoLisciaste extends Drzewo {
		
		private int ksztaltLiscia;
		
		public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
			super (wiecznieZielone, wysokosc, przekrojDrzewa);
			this.ksztaltLiscia = ksztaltLiscia;
		}
		
		public int getKsztaltLiscia() {
			return ksztaltLiscia;
		}
		
		public String toString() {
			return "Czy nie gubi lisci: " + getWiecznieZielone() + "\nWysokosc: " + getWysokosc() 
					+ "\nPrzekroj drzewa: "	+ getPrzekrojDrzewa() + "\nksztaltLiscia: " + ksztaltLiscia;
		}
		
		
		
}
