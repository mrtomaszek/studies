package kwiaciarnia;
import java.util.*;

public class ShoppingCart extends Container{
	
	private String name;
	
	public ShoppingCart(String name) {
		this.name = name;
	}
		
	public String toString() {
		if (super.length() > 0) {
		return "W�zek w�a�ciciela " + name + "\n" + super.toString();
		}
		else {
			return "W�zek w�a�ciciela " + name + "-- pusto";
		}
	}
	
}
