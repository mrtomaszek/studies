package Guiz07_Gr26c_Jadczak_S16522;

public class Administrator extends Informatyk {

	private String architekturaSieci;
	
	public Administrator(String nazwisko, int staz, String architekturaSieci) {
		super(nazwisko, staz);
		this.architekturaSieci = architekturaSieci;
		
	}
	
	public String getArch(){
		return architekturaSieci;
	}
	
	public String toString(){		
		return super.toString() + " architektura sieci: " + architekturaSieci;
	}
	
	
}
