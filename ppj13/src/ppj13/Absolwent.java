package ppj13;

public class Absolwent extends Student{
			
		public Absolwent(String imie, int rokUrodzenia, int numerIndeksu, int rokStudiow, Przedmiot przedmioty[]){
			super(imie, rokUrodzenia, numerIndeksu, rokStudiow, przedmioty);
		}
		
		public String toString(){
				 return "inz " + super.toString();
				
		}

}
