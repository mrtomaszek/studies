package zadanie9;

public class Spiewak extends Thread {
		private String name;
		public static int stnumber = 0;
		private int nr;
		private char tekst;
		private boolean running = true;
		
		
		public Spiewak(char tekst) {
			super("Spiewak "+tekst);
			this.tekst = tekst;
			nr = ++stnumber;
			
		}
				
		public char spiewaj(){
			int r = (int)(Math.random() * 2);
			if (r == 1){
			    tekst =  Character.toLowerCase(tekst);
			}
			return tekst;
			
		};
		
		public void setTekst(char c){
			this.tekst = c;
		}
		
		public int getNr(){
			return nr;
		}
		
		public void run(){
			while(running){
				
				for(int i = 1; i <= getNr(); i++){
					System.out.print(spiewaj());
				}
				try{
					sleep(2000);
				}
				catch(InterruptedException e){
					stopRunning();
				}
				
			}
		}
		
		public void stopRunning(){
			running = false;
		}
		
		/*public static Spiewak najglosniej(Spiewak[] spiewak) {
            int index = 0;
            String letters;
            String sentence = tekst.toString();
            long first;
            long last = 0;
            for (int i = 0; i < spiewak.length; i++) {
            	sentence = spiewak[i].spiewaj().toLowerCase();
            	letters = sentence.replaceAll("[^a-z]", "");
            	first = letters.chars().distinct().count();
            	if(first > last) {
            		last = first;
            		index = i;
            	}
            }
            
            return spiewak[index];
        }
		*/

		public String toString() {
			return "(" + nr + ") " + getName() + ": " + spiewaj() ;
		}
}
