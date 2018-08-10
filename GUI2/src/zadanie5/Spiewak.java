package zadanie5;
import static java.lang.Math.toIntExact;
public abstract class Spiewak implements Comparable<Spiewak>{
		private String name;
		public static int stnumber = 0;
		private int nr;
		
		public Spiewak(String name) {
			this.name = name;
			nr = ++stnumber;
			
		}
		
		abstract String spiewaj();
		
		public String getName() {
			return name;
		}
		public int getNr(){
			return nr;
		}

		public static Spiewak najglosniej(Spiewak[] spiewak) {
            int index = 0;
            String letters;
            String sentence;
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
		public int poziomGlosnosci(){
			long first;
           	String sentence = spiewaj().toLowerCase();
            String letters = sentence.replaceAll("[^a-z]", "");
            first = letters.chars().distinct().count();
            int result = toIntExact(first);
            return result;
		}
		
		public int compareTo(Spiewak other){
			int result = this.poziomGlosnosci() > other.poziomGlosnosci() ? -1 : this.poziomGlosnosci() < other.poziomGlosnosci() ? 1 : 0;
			if (result==0){
				result = this.getName().compareTo(other.getName());
				if (result == 0){
					result = this.getNr() < other.getNr() ? -1 : this.getNr() > other.getNr() ? 1 : 0;
					}
			}
			
			return result;			
		}

		public String toString() {
			return "(" + nr + ") " + getName() + ": " + spiewaj() ;
		}
}
