package zadanie9;

import java.util.*;

public class Chor {
	
		String repertuar;
		ArrayList<Spiewak> sp = new ArrayList<Spiewak>();
		
		public Chor(String repertuar){
			for (int i = 0; i < repertuar.length(); i++){
				char c = repertuar.charAt(i);
				sp.add(new Spiewak(c));
				//sp.get(i).setName("Spiewak " + c);
				}
		}
		
		public ArrayList<Spiewak> getThreads(){
			return sp;
			
		}
		
}
