
public class DrzewoOwocowe extends DrzewoLisciaste{
		
		private String nazwaOwoca;
		
		public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
			super (wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
			this.nazwaOwoca = nazwaOwoca;
		}
		
		public String toString() {
			return "Czy nie gubi lisci: " + getWiecznieZielone() + "\nWysokosc: " + getWysokosc() 
					+ "\nPrzekroj drzewa: "	+ getPrzekrojDrzewa() + "\nksztaltLiscia: " + getKsztaltLiscia() + "\nNazwa owoca: " + nazwaOwoca;
		}
		
				
		public void zerwijOwoc() throws DrzewoBezOwocoweException {
				if (nazwaOwoca != null)
					System.out.println(nazwaOwoca);
				else
					throw new DrzewoBezOwocoweException("to drzewo nie ma owocow!");
		}
}
