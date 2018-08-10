
public class Skrzypek extends Muzyk {
	
	private String instrument = "skrzypce";
	private double stawka = 200.0;
	
	public Skrzypek(String imie, double czas){
		super(imie, czas);
		this.instrument = instrument;
		this.stawka = stawka;
	}
	
	public String instrument (){
		return instrument;
	}
	
	public double stawka(){
		return stawka;
	}
}
