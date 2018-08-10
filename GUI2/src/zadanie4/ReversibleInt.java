package zadanie4;

public class ReversibleInt implements Reversible {
	
	private int var;
	
	public ReversibleInt (int var) {
		this.var = var;
	}
	@Override
	public void reverse() {
			var = var * (-1);
		
	}
	
	
	public String toString() {
		 return Integer.toString(var);
	}
	@Override
	public void change() {
		var = var + 10;
		
	}
		
	
}
