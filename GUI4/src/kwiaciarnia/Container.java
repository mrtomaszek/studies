package kwiaciarnia;

import java.util.*;

abstract class Container {
	
	private ArrayList<Flower> flowerList = new ArrayList<Flower>();
	PriceList pl = PriceList.getInstance();
	
	public int length() {
		return flowerList.size();
	}
	
	public ArrayList getMyFlowers() {
		return flowerList;
	}
		
	public void add(Flower flower) {
		flowerList.add(flower);
		flower.setPrice(flowerPrice(flower.getName()));
		}
	
	public Flower getFlower(int index) {
		return flowerList.get(index);
	}
	
	public double getValueByColour(String colour) {
		double value = 0;
		for (int i = 0; i < flowerList.size(); i++) {
			if (flowerList.get(i).getColour().equals(colour)) {
				value += flowerList.get(i).getPrice() * flowerList.get(i).getQuantity() ;
			}
		}
		return value;
	}
	public boolean checkIfInCart(String name) {
		for (int i = 0; i < flowerList.size(); i++) {
			if (flowerList.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	public void getFlowerByNameSearch (String name) {
		for (int i = 0; i < flowerList.size(); i++) {
			if (flowerList.get(i).getName().equals(name)) {
			}
		}
	}
	public double flowerPrice(String name) {
		double price = 0;
		if(pl.checkIfIn(name)) {
			if (pl.checkArrayLength(name)) {
				if(getFlowerQuantity(name) > (int)pl.getMyPriceList(name).get(1)) {
					return price += (double)pl.getMyPriceList(name).get(2);
				}
				else {
					return price += (double)pl.getMyPriceList(name).get(0);
				}
			}
			else {
				return price += (double)pl.getMyPriceList(name).get(0);
			}
		}
		else {
			return price = -1;
		}
	}
	
	public int getFlowerQuantity (String name) {
		int result = 0;
		for (int i = 0; i < flowerList.size(); i++) {
			if (flowerList.get(i).getName().equals(name)) {
				result += flowerList.get(i).getQuantity();
			}
		}
		return result;
	}
	public double flowerBouqetPrice(String name) {
		return flowerPrice(name) * getFlowerQuantity(name);
	}
	public String toString() {
		String result = "";
		for (Flower f : flowerList)
			result += f.toString() + "\n";
		return result;
	}

}
