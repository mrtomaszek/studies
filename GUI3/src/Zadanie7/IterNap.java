package Zadanie7;

import java.util.*;

public class IterNap implements Iterable<Character> {
	
	private String sentence;
	private int index = 0;
	private int jump = 0;
	
	public IterNap(String sentence){
		this.sentence = sentence;
	}
	
	public int ustawPoczatek(int nIndex){
		index += nIndex;
		return index;
	}
	
	public int ustawKrok(int jump){
		this.jump = jump;
		return jump;
	}
	
	
	@Override
	public Iterator<Character> iterator() {
			int length = sentence.length();
		return new Iterator<Character>(){
			private int currentIndex = index;
			
			@Override
			public boolean hasNext() {
				
				return currentIndex < length;
				}
				
			
			@Override
			public Character next() {
				char x;
				if (jump == 0){
				return sentence.charAt(currentIndex++);
				}
				else {
					x = sentence.charAt(currentIndex);
					currentIndex += jump;
				return x;
				}
				
			}
			
		};
		
	}

}
