import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class Zadanie15 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> createGUI());
	}

	protected static void createGUI() {

		JFrame jf = new JFrame();

		jf.setTitle("przyciski");

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setLocation(50, 50);

		jf.setResizable(false);
		
		String[] ans = {"A", "B", "C", "D", "E", "F", "G"};
		LayoutManager [] lays = {new BorderLayout(), new FlowLayout(), new FlowLayout(FlowLayout.LEFT),new FlowLayout(FlowLayout.RIGHT),
				new GridLayout(1, 0), new GridLayout(0, 1),new GridLayout(3, 2) };
				
		String in = JOptionPane.showInputDialog("Podaj literke: ");
		MyPanel panel = new MyPanel(in);
		
		for(int i = 0 ; i < ans.length; i ++){
			if(in.toUpperCase().equals(ans[i])){
				panel.setLayout(lays[i]);
				String [] bor = { BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER};
				String [] nazwy = {"Przycisk 1","P 2","Wiekszy przycisk numer 3","Przycisk 4","P5"};
				for(int i1 = 0; i1 < nazwy.length; i1++){
					if (in.toUpperCase().equals("A")){
						panel.add(new JButton(nazwy[i1]), bor[i1]);
					}
					else {
						panel.add(new JButton(nazwy[i1]));
					}
				}
			}
		}
		
						
		jf.setContentPane(panel);

		jf.pack();

		jf.setVisible(true);
	}

}

class MyPanel extends JPanel {
	
	MyPanel(String in){
        setPreferredSize(new Dimension(400,400));
     }
}
