package Zadanie13;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

import javax.swing.*;



public class DrawFigures {
	
	public static void main(String[] args) {
	
	
	File file = new File(args[0]);
	Scanner data;
	String regex1 = "[\\d{1,3})\\s(\\d{1,3})\\s(\\d{1,3})\\s(\\d{1,3}]";
	String regex2 = "[\\d{1,3})\\s(\\d{1,3})\\s(\\d{1,3})]";
	
	
	try {
		data = new Scanner(file);
		while (data.hasNextLine()) {
			 String nextLine = data.nextLine();
             if (nextLine != null) {
                 if ( !nextLine.matches(regex2)) {
                	 ArrayList<Integer> dimensions = new ArrayList<Integer>();
                	 Scanner ints = new Scanner(nextLine);
                	 while(ints.hasNextInt()) {
                	 dimensions.add(Integer.parseInt(nextLine));
                	 }
                	 
                	 new DrawSwing();
                	 
                 }
             }
		} 
	}catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
    public DrawSwing()
    {
    	SwingUtilities.invokeLater(() -> createGUI());
    }
    
    protected void createGUI()
    {
    		
        JFrame jf = new JFrame();
        jf.setTitle("Koła i trójkąty");
      	
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jf.setLocation(50,50);
        	
			// utworzenie obszaru rysowania - pulpitu
        String in = JOptionPane.showInputDialog("Podaj srednice: ");
		int r = Integer.parseInt(in);
		
        
        MyPanel p = new MyPanel(r);
		
		
			// wymiana domyĹlnego pulpitu na wĹasny
        jf.setContentPane(p);	
       
        	// upakowanie okna
        jf.pack( );
        	
        	// wyĹwietlenie okna
        jf.setVisible(true);   
    }
}

class MyPanel
	extends JPanel {
	private int r;
    	// konstruktor     
    MyPanel(int r)
    {
        this.r = r; 
    	// ustalenie rozmiarĂłw poczÄtkowych
        setPreferredSize(new Dimension(400,400));     
    }
    
    public int getR(int r){
    	return r;
    }
    
    
    public void paintComponent(Graphics g)
    {
          // musi byÄ jako pierwsza instrukcja
        super.paintComponent(g);
        
          // pobranie aktualnych rozmiarĂłw
        int width = getWidth();
        int height = getHeight();
        
	        // TU RYSUJEMY!
        // ........
        g.setColor(Color.red);
        g.fillOval((width - r)/2,(height - r)/2, r, r);
        g.setColor(Color.white);
        g.fillArc((width - (int)(r*0.8))/2,(height - (int)(r*0.8))/2, (int)(r * 0.8), (int)(r * 0.8), 0, 180);
        
        
        
        //g.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 30));
        //g.drawString("Tu rysujemy!", width/2, height/2);
    	// ........
    }

}
