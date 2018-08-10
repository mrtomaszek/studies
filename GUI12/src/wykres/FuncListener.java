package wykres;

import javax.swing.event.*;

public class FuncListener implements DocumentListener{

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		Zadanie19.equation[0] = Zadanie19.func.getText();
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		Zadanie19.equation[0] = Zadanie19.func.getText();
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		Zadanie19.equation[0] = Zadanie19.func.getText();
	}

}
