package com.tomasz;

public class Walec {
		private double promienr;
		private double wysokosch;
	
		public Walec(double promienr, double wysokosch) {
		this.promienr = promienr;
		this.wysokosch = wysokosch;
		}
	
		public double getPowierzchniaPodstawy() {
		return Math.PI * promienr * promienr;
		}
		public double getObjetoscWalca() {
		return getPowierzchniaPodstawy() * wysokosch;
	    }
		public void show(){
			System.out.printf("Powierzchnia to: %.2f%n", getPowierzchniaPodstawy());
			System.out.printf("Powierzchnia to: %.2f%n", getObjetoscWalca());
			System.out.println();
			
		}
		
		
		
}
