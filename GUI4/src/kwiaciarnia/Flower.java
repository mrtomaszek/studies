package kwiaciarnia;

public abstract class Flower {
		
		private int quantity;
		private String name;
		private String colour;
		private double price;
		PriceList pl = PriceList.getInstance();
		
		public Flower(int quantity) {
			this.quantity = quantity;
		}
		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price; 
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		
		public String toString() {
			return getName() + ", kolor: " + getColour() + ", iloœæ " + getQuantity() + ", cena " + getPrice();
		}
		
}
