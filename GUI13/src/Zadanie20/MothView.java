package Zadanie20;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MothView extends JFrame{
	
	JFrame frame = new JFrame();
	JScrollPane pane = new JScrollPane();
	JList list = new JList();
	MyModel model = new MyModel();;
	
	
	public MothView() {
		
	}
	
	
	public void runCalendar() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(200,200));
		 list.setModel(model);
		 pane.setViewportView(list);
		 frame.add(pane);
		 frame.pack();
		 frame.setVisible(true);
		 frame.setTitle(model.getMonth());
	}
	
		
		
}
