
public class Wiolonczelista extends Muzyk{
	private String instrument = "Wiolonczela";
	private double stawka = 250.0;
	
	public Wiolonczelista(String imie, double czas){
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
