package wykres;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Zadanie19 {
	
	static double [] values = new double [4];
	static String [] equation = {""};
	JFrame jf = new JFrame();
	JPanel two = new JPanel();
	static JTextField xmin = new JTextField();
	static JTextField xmax = new JTextField();
	static JTextField ymin = new JTextField();
	static JTextField ymax = new JTextField();
	static JTextField func = new JTextField();
		
	
	public static void main(String[] args) {
		new Zadanie19().chart();
	}

	private void chart() {
		
		jf.setLayout(new BorderLayout());
		
		Chart chart = new Chart(values, equation);
		chart.setPreferredSize(new Dimension (400, 400));
		jf.add(chart, BorderLayout.CENTER);
				
		two.setPreferredSize(new Dimension (400, 30));
		two.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
				
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		xmin.setToolTipText("Min X");
		xmin.getDocument().addDocumentListener(new Listen());
		two.add(xmin, c);
		
		c.gridx = 1;
		xmax.setToolTipText("Max X");
		xmax.getDocument().addDocumentListener(new Listen());
		two.add(xmax, c);
		
		c.gridx = 2;
		ymin.setToolTipText("Min Y");
		ymin.getDocument().addDocumentListener(new Listen());
		two.add(ymin, c);
		
		c.gridx = 3;
		ymax.setToolTipText("Max Y");
		ymax.getDocument().addDocumentListener(new Listen());
		two.add(ymax, c);
		
		
		c.gridy = 1;
		c.gridx = 0;
		c.gridwidth = 4;
		func.getDocument().addDocumentListener(new FuncListener());
		two.add(func, c);
		
		jf.addComponentListener(new ComponentAdapter() {
	    @Override
	    public void componentResized(ComponentEvent e)
	    {
	        chart.repaint();
	    }
		});
		
		
		jf.add(two, BorderLayout.PAGE_END);

		jf.setTitle("Wykres");

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setResizable(true);

		jf.setVisible(true);
		
		jf.pack();
	}
	
	
	
}

