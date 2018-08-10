package kwiaciarnia;

import java.util.*;

public class Customer {
		
	private String name;
	private double money;
	ShoppingCart cart = new ShoppingCart(this.name);
	PriceList pl = PriceList.getInstance();
	
	public Customer(String name, double money) {
		this.money = money;
		this.name = name;
		cart = new ShoppingCart(name);
	}
	
	public String getName() {
		return name;
	}
	public void get(Flower flower) {
		    cart.add(flower);
		    
		     }
	public void pay(Boolean b) {
		checkIfHasPrice();
		if (b == true) {
			for (int i = 0; i < cart.length(); i++) {
				if(money > cart.flowerBouqetPrice(cart.getFlower(i).getName())) {
				money -= cart.flowerBouqetPrice(cart.getFlower(i).getName());
				}
				else {
					cart.getMyFlowers().remove(i);
				}
			}
		}
		else {
			for (int i = 0; i < cart.length(); i++) {
				if(money > cart.flowerBouqetPrice(cart.getFlower(i).getName())) {
				money -= (cart.flowerBouqetPrice(cart.getFlower(i).getName()) + commissionFromTheCard(i));
				}
				else {
					cart.getMyFlowers().remove(i);
				}
			}
			
		}
	}
	public double commissionFromTheCard(int i) {
		return cart.flowerBouqetPrice(cart.getFlower(i).getName()) * 0.01;
	}
	public void checkIfHasPrice() {
		for(int i = 0; i < cart.length(); i++) {
			if (pl.checkIfIn(cart.getFlower(i).getName()) != true){
				cart.getMyFlowers().remove(i);
			}
		}
	}
	public double getCash() {
		return money;
	}

	public ShoppingCart getShoppingCart() {
		return cart;
	}
	
	public void pack(Box box) {
		for(int i = 0; i < cart.length(); i++) {
			box.add(cart.getFlower(i));
		}
		cart.getMyFlowers().removeAll(box.getMyFlowers());
		
	}
}
