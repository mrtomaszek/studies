package ppj13;

public class Student extends Osoba{

		private int numerIndeksu;
		private int rokStudiow;
		Przedmiot przedmioty[];
		
		public Student(String imie, int rokUrodzenia, int numerIndeksu, int rokStudiow, Przedmiot przedmioty[]){
			super (imie, rokUrodzenia);
			this.numerIndeksu = numerIndeksu;
			this.rokStudiow = rokStudiow;
			this.przedmioty = przedmioty;
			}
		
				
		public boolean maAbsolutorium(){
			for (int i = 0; i < przedmioty.length; i++){
				if (przedmioty[i].zaliczony == false)
					return false;						
				}
			return true;
				
		}
		
		public Absolwent obrona() throws ITNException{
			if (maAbsolutorium() == false){
				throw new ITNException("nie zaliczyl wszystkich przedmiotow");
			}
			else
				return new Absolwent(imie, rokUrodzenia, numerIndeksu, rokStudiow, przedmioty);
		}
}
