package ppj11;

public class Sloik {
		
		Dzem dzem;
		private int stan;
		
		public Sloik(){
			
				
		}
		
		public void otworz(){
			stan = 0;
		}
		public void zamknij(){
			stan = 1;
		}
		public boolean czyOtwarty(){
			if (stan == 0)
				return true;
			else
				return false;
		}
		
		public boolean czyPusty() {
			return dzem == null;
		}
		
		public void addDzem(Dzem dzem){
			if (czyOtwarty() && czyPusty()) {
				this.dzem = dzem;
			}
		}
		
		
		
}
