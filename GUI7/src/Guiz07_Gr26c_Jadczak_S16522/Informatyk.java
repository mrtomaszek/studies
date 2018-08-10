package Guiz07_Gr26c_Jadczak_S16522;

public class Informatyk{
	
	private String nazwisko;
	private int staz;
	public static int id = 0;
	private int number; 
	private String opis;
	
	public Informatyk(String nazwisko, int staz){
		this.nazwisko = nazwisko;
		this.staz = staz;
		id++;
		this.opis = nazwisko +" staz:" + staz + " id:" + id;
		
	}
	
	public String getName(){
		return nazwisko;
	}
	
	public int getStaz(){
		return staz;
	}
	
	public int getId(){
		return number;
	}
	
	public String toString(){
		return opis;
	}

}
