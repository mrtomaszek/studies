package zadanie4;

public class ReversibleString implements Reversible{
	
	private String text;
	
	public ReversibleString(String text){
		this.text = text;
	}
	
	public void reverse(){
		StringBuilder temp = new StringBuilder(text);
		char c;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i))) {
				c = Character.toUpperCase(text.charAt(i));
				temp.setCharAt(i, c);
			}
			else {
				c = Character.toLowerCase(text.charAt(i));
				temp.setCharAt(i, c);
			}
		}
		text = temp.toString();
	};
	@Override
	public void change() {
		text = "Tekst " + text;
		
	}

	public String toString() {
		return text;
	}

	
}
