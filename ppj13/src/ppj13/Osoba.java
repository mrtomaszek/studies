package ppj13;

public class Osoba {

		protected String imie;
		protected int rokUrodzenia;
		
		public Osoba(String imie, int rokUrodzenia){
			this.imie = imie;
			this.rokUrodzenia = rokUrodzenia;
		}
		
		public int pobierzWiek(){
			return rokUrodzenia;
		}
		
		public String toString(){
				return imie;		
		}
		
}
