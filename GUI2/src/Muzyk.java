
public abstract class Muzyk {

	protected String imie;
	protected double czas;
	
	
	public Muzyk(String imie, double czas){
		this.imie = imie;
		this.czas = czas;
	}
	
	abstract String instrument ();
		
	abstract double stawka();
	
	public static Muzyk maxHonorarium(Muzyk[] muzyk){
		double maxIncome = 0;
		int index = -1;
		for(int i = 0; i < muzyk.length; i++){
			if((muzyk[i].czas * muzyk[i].stawka()) > maxIncome){
				maxIncome = (muzyk[i].czas *muzyk[i].stawka());
				index = i;
			}
		}
		return muzyk[index];
		
	}
	
	public String toString(){
		return imie + ", czas = " + czas + " godz., stawka = " + stawka();
		
	}
	
	public String imie(){
		return imie;
	}
	public double czas(){
		return czas;
	}
	
	
}
