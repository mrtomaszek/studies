import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Zadanie16 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> createGUI());
	}

	protected static void createGUI() {

		JFrame jf = new JFrame();

		jf.setTitle("kolorowy przycisk");

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setLocation(50, 50);
		
		jf.setResizable(true);
		Color [] color = {Color.BLACK, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
		JButton but = new JButton("Click me");
		jf.add(but);
		but.addActionListener(new ActionListener(){
			int i = 0;
			public void actionPerformed(ActionEvent e) {
				if (i == color.length){
					i = 0;
				}
				but.setBackground(color[i]);
				i++;
				}
			}
		);
		
		jf.pack();

		jf.setVisible(true);
	}
}
