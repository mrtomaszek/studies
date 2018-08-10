
public class Kwadrat {
	
		private double bok;
		private double promien;
		private double wysokosc;
		
		public Kwadrat(double bok) {
			this.bok = bok;
			this.promien = bok/2;
			this.wysokosc = bok;
		}
		
		public double getPowierzchnia() {
			return bok * bok;
		}
		public double getObjetosc() {
			return bok*bok*bok;
		}
		
		public void WalecWKwadrat() {
			System.out.printf("Wymiary walca wpisanego w kwadrat o boku: %.2f%n", bok);
			System.out.printf("Promien walca: %.2f%n", promien);
			System.out.printf("Wysokosc walca: %.2f%n", wysokosc);
			System.out.println();
		}
		public void show(){
			System.out.printf("Powierzchnia to: %.2f%n", getPowierzchnia());
			System.out.printf("Powierzchnia to: %.2f%n", getObjetosc());
			System.out.println();
		}
		
		
		
}
