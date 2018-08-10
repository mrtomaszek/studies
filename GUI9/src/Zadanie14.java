import java.awt.Dimension;

import javax.swing.*;
import java.awt.*;

public class Zadanie14 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> createGUI());
	}

	protected static void createGUI() {

		JFrame jf = new JFrame();

		jf.setTitle("edytor tekstu");

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setLocation(50, 50);
		
		jf.setResizable(true);
		JTextArea jText = new JTextArea(50, 50);
		jText.setFont(new Font("Arial", Font.BOLD, 48));
		jText.setBackground(Color.GREEN);
		jText.setForeground(Color.BLUE);
		jf.setContentPane(jText);
		
		jf.pack();

		jf.setVisible(true);
	}
}

