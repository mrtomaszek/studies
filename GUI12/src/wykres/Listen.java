package wykres;
import javax.swing.event.*;

public class Listen implements DocumentListener{
	
	
	public static void check() {
		String [] values = {Zadanie19.xmin.getText(), Zadanie19.xmax.getText(), Zadanie19.ymin.getText(), Zadanie19.ymax.getText()}; 
		for(int i = 0; i < values.length; i++) {
			if(values[i].matches("^-?\\d+")) {
				Zadanie19.values[i] = Double.parseDouble(values[i]);
			}
		}	
	}
	
	@Override
	public void changedUpdate(DocumentEvent e) {
		check();
		}
    @Override
	public void insertUpdate(DocumentEvent e) {
    	check();
		}
	
	@Override
	public void removeUpdate(DocumentEvent e) {
		check();
	}
}
