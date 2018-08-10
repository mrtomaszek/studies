
public class Flecista extends Muzyk{
	private String instrument = "Flet";
	private double stawka = 300.0;
	
	public Flecista(String imie, double czas){
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
