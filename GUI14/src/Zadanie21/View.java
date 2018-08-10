package Zadanie21;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class View extends JFrame{

	
	private JFrame jf = new JFrame();
	private JScrollPane pane = new JScrollPane();
	private JTextField input = new JTextField();
	private JList capList = new JList();
	private Model model = new Model();
	
	public View() {
		
	}
	
	public void runView() {
		
		jf.setPreferredSize(new Dimension(200,200));
		jf.setLayout(new BorderLayout());
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		input.addActionListener(action);
		jf.add(input, BorderLayout.PAGE_START);
		capList.setModel(model);
		capList.addMouseListener(mouseListener);
		capList.addMouseListener(mouseListener2);
		pane.setViewportView(capList);
		jf.add(pane, BorderLayout.CENTER);
		jf.pack();
		jf.setVisible(true);
		jf.setTitle("Capitols");
		
		
	}
	
	
	Action action = new AbstractAction(){
	    @Override
	    public void actionPerformed(ActionEvent e){
	    	if(input.getText().length()>0) {
				model.addCity(input.getText());
				model.sortList();
				input.setText("");
				model.update();
	    	}
	    }
	};
	
	MouseListener mouseListener = new MouseAdapter() {
	    public void mouseClicked(MouseEvent e) {
	        if (e.getClickCount() == 2) {
	           String selectedItem = (String) capList.getSelectedValue();
	           model.rmCity(selectedItem);
	           model.update();

	         }
	    }
	};
	
	MouseListener mouseListener2 = new MouseAdapter() {
	    public void mouseClicked(MouseEvent e) {
	        if (e.getClickCount() == 1) {
	           ArrayList<String> selectedItem = (ArrayList<String>) capList.getSelectedValuesList();
	           model.selected(selectedItem);
	           model.update();

	         }
	    }
	};
	
	
}
