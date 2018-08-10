
public class Walec {
		private double promien;
		private double wysokosc;
	
		public Walec(double promien, double wysokosc) {
		this.promien = promien;
		this.wysokosc = wysokosc;
		}
	
		public double getPowierzchniaPodstawy() {
		return Math.PI * promien * promien;
		}
		public double getObjetoscWalca() {
		return getPowierzchniaPodstawy() * wysokosc;
	    }
		public void show(){
			System.out.printf("Powierzchnia to: %.2f%n", getPowierzchniaPodstawy());
			System.out.printf("Powierzchnia to: %.2f%n", getObjetoscWalca());
			System.out.println();
			
		}
		
		
		
}
