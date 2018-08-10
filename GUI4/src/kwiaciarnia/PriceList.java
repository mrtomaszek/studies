package kwiaciarnia;

import java.util.*;

public class PriceList {
		
	private Map<String, ArrayList> map = new HashMap<String, ArrayList>();
	private static PriceList instance;
			
		private PriceList() {
			
		}
		
		public static synchronized PriceList getInstance() {
			if (instance == null) {
				instance = new PriceList();
			}
			return instance; 
		}
		
		public void put(String c, double p) {
			ArrayList priceL = new ArrayList();
			priceL.add(p);
			map.put(c, priceL);
		}
		public void put(String c, double p, int i, double z) {
			ArrayList priceL = new ArrayList();
			priceL.add(p);
			priceL.add(i);
			priceL.add(z);
			map.put(c, priceL);
		}
		
		public boolean checkIfIn(String name) {
			if(map.containsKey(name)) {
				return true;
			}
			else {
				return false;
			}
		}
		public boolean checkArrayLength(String name) {
			if(getMyPriceList(name).size() > 1) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public ArrayList getMyPriceList(String name) {
			return map.get(name);
			}
						
		public String toString() {
			return map.toString();
		}
		
}
