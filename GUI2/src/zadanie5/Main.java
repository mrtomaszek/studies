package zadanie5;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		Spiewak s1 = new Spiewak("Carrey"){

			@Override
			String spiewaj() {
				return "oaoooooooooo";
				}
	        };
	  
	        Spiewak s2 = new Spiewak("Houston"){

				@Override
				String spiewaj() {
					return "a4iBBiii";
				}
			};
	  
	        Spiewak s3 = new Spiewak("Madonna"){

				@Override
				String spiewaj() {
					return "aAa";
				}

	        };
	        
	        Spiewak s4 = new Spiewak("Darrey"){

				@Override
				String spiewaj() {
					return "bebe";
				}
	        	
	        };
	        Spiewak s5 = new Spiewak("Darrey"){

				@Override
				String spiewaj() {
					return "bebe";
				}
	        	
	        };
	        
	        
	        
	  
	        Spiewak sp[] = {s1, s2, s3};
	  
	        for (Spiewak s : sp)
	            System.out.println(s);
	        
	        System.out.println("\n" + Spiewak.najglosniej(sp));
	        System.out.println();
	        
	        ArrayList<Spiewak> nowaLista = new ArrayList<Spiewak>();
	        nowaLista.add(s1);
	        nowaLista.add(s2);
	        nowaLista.add(s3);
	        nowaLista.add(s4);
	        nowaLista.add(s5);
	        Collections.sort(nowaLista);
	        for (Spiewak p : nowaLista){
	        	System.out.println(p);
	        }
	        
	}

}
