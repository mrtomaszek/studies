package Zadanie11;

import java.util.Arrays;
import java.util.LinkedList;

public class Buffer {

	private LinkedList<Integer> bufor = new LinkedList<Integer>();
		
	public Buffer() {
		
	}
	
	public synchronized void put(int number) {
			this.bufor.add(number);
	}
	
	public int get() {
		int result = bufor.removeFirst();
		return result;
	}
	
	public int getSize() {
		return bufor.size();
	}
	
	public String toString() {
	    return Arrays.toString(bufor.toArray());

	}
}
