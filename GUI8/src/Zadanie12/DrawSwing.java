package Zadanie12;

import java.awt.*; 	
import javax.swing.*;

public class DrawSwing {

    public static void main(String[] args)
    {
    	new DrawSwing();
    }
    
    public DrawSwing()
    {
    	SwingUtilities.invokeLater(() -> createGUI());
    }
    
    protected void createGUI()
    {
    		// utworzenie okna
        JFrame jf = new JFrame();
      
        	// okreĹlenie tytuĹu okna
        jf.setTitle("Rysowanie");
      		
      		// obsĹuga zamkniÄcia okna JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        	// okreĹlenie poĹoĹźenia okna
        jf.setLocation(50,50);
        
        	// uniemoĹźliwienie zmiany rozmiarĂłw okna
        jf.setResizable(false);
		
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