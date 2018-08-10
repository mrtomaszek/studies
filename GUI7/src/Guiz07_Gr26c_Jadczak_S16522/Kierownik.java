package Guiz07_Gr26c_Jadczak_S16522;

public class Kierownik extends Informatyk {

	private int iloscProj;
	
	public Kierownik(String nazwisko, int staz, int iloscProj) {
		super(nazwisko, staz);
		this.iloscProj = iloscProj;
	}
	
	public int getProj(){
		return iloscProj;
	}
	
	public String toString(){
		return super.toString() + " ilosc projektow: " + iloscProj;
	}

}
